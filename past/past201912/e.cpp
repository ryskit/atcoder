#include <bits/stdc++.h>
using namespace std;
using ll = long long;
#define rep(i,n) for (int i = 0; i < (int)(n); ++i)

int main() {
    int N, Q;
    cin >> N >> Q;

    // follow list
    vector<vector<bool>> F(N, vector<bool>(N, false));

    rep(i, Q) {
        int type;
        cin >> type;
        if (type == 1) {
            // フォロー
            int a, b;
            cin >> a >> b;
            --a;
            --b;
            F[a][b] = true;
        } else if (type == 2) {
            // フォロー全返し
            int a;
            cin >> a;
            --a;
            vector<int> g;
            rep(x, N) {
                if (x == a) {
                    continue;
                }
                if (F[x][a]) {
                    F[a][x] = true;
                }
            }
        } else if (type == 3) {
            // フォローフォロー
            int a;
            cin >> a;
            --a;
            vector<int> g;
            rep(x, N) {
                if (F[a][x]) {
                    g.push_back(x);
                }
            }
            for (auto x = g.begin(); x != g.end(); ++x) {
                // ユーザーxがフォローしているユーザーを探す
                rep(y, N) {
                    // フォローしていれば
                    if (F[(*x)][y]) {
                        F[a][y] = true;
                    }
                }
            }
        }
    }

    rep(i, N) {
        rep(j, N) {
            if (F[i][j]) {
                cout << "Y";
            } else {
                cout << "N";
            }
            if (j == N -1) {
                cout << endl;
            }
        }
    }
    return 0;
}