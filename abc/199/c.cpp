#include <bits/stdc++.h>
using namespace std;
using ll = long long;
#define rep(i,n) for (int i = 0; i < (n); ++i)

int main() {
    int N, Q;
    string S;
    cin >> N >> S >> Q;

    bool be_swap = false;
    rep(i, Q) {
        int T, A, B;
        cin >> T;
        if (T == 1) {
            cin >> A >> B;
            --A, --B;
            char tmpA, tmpB;
            if (be_swap) {
                if (A >= N) {
                    A = A - N;
                } else {
                    A = A + N;
                }

                if (B >= N) {
                    B = B - N;
                } else {
                    B = B + N;
                }
            }
            tmpA = S[A];
            tmpB = S[B];
            S[A] = tmpB;
            S[B] = tmpA;
        } else if (T == 2) {
            cin >> A >> B;
            be_swap = !be_swap;
        }
    }

    if (be_swap) {
        string tmp1, tmp2;
        tmp1 = S.substr(0, N);
        tmp2 = S.substr(N);
        S = tmp2 + tmp1;
    }
    cout << S << endl;
    return 0;
}