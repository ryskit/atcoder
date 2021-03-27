#include <bits/stdc++.h>
using namespace std;

int main() {
    int N;
    cin >> N;

    int H, W;
    H = N - 1;
    W = (2 * N - 1) - 1;

    vector<string> S(N);
    for (int i = 0; i < N; ++i) {
        string s;
        cin >> s;
        S[i] = s;
    }

    for (int i = H - 1; i >= 0; --i) {
        for (int j = 0; j < W; j++) {
            if (S[i][j] == '#') {
                if(j == 0) {
                    if (S[i + 1][j] == 'X' || S[i + 1][j+1] == 'X') {
                        S[i][j] = 'X';
                    }
                } else if (j == W) {
                    if (S[i + 1][j - 1] == 'X' || S[i + 1][j] == 'X') {
                        S[i][j] = 'X';
                    }
                } else {
                    if (S[i + 1][j - 1] == 'X' || S[i + 1][j] == 'X' || S[i + 1][j+1] == 'X') {
                        S[i][j] = 'X';
                    }
                }
            }
        }
    }

    for (int i = 0; i < N; i++) {
        cout << S[i] << endl;
    }
    return 0;
}