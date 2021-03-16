#include <bits/stdc++.h>
using namespace std;

int main() {
    vector<vector<int>> A(3, vector<int>(3));
    vector<vector<bool>> B(3, vector<bool>(3, false));

    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            int a;
            cin >> a;
            A[i][j] = a;
        }
    }

    int N;
    cin >> N;

    for (int x = 0; x < N; x++) {
        int n;
        cin >> n;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (A[i][j] == n) {
                    B[i][j] = true;
                    break;
                }
            }
        }
    }

    bool Result = false;
    // ビンゴ達成か確認

    for (int i = 0; i < 3; i++) {
        if (B[i][0] && B[i][1] && B[i][2]) {
            Result = true;
        }
    }

    for (int i = 0; i < 3; i++) {
        if (B[0][i] && B[1][i] && B[2][i]) {
            Result = true;
        }
    }

    if (B[0][0] && B[1][1] && B[2][2]) {
        Result = true;
    }

    if (B[0][2] && B[1][1] && B[2][0]) {
        Result = true;
    }

    if (Result) {
        cout << "Yes" << endl;
    } else {
        cout << "No" << endl;
    }
}