#include <bits/stdc++.h>
using namespace std;
using ll = long long;
#define rep(i,n) for (int i = 0; i < (n); ++i)

int main() {
    int N, K, X, Y;
    cin >> N >> K >> X >> Y;
    int sum = 0;
    rep(i, N) {
        if (i < K) {
            sum += X;
        } else {
            sum += Y;
        }
    }
    cout << sum << endl;
}

