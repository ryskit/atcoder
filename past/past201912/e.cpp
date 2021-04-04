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
            rep(x, N) {
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
                    rep(y, N) {
                        if (F[x][y] && y != a) {
                            g.push_back(y);
                        }
                    }
                }
            }
            for (auto y = g.begin(); y != g.end(); ++y) {
                F[a][(*y)] = true;
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