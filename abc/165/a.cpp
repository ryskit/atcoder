#include <bits/stdc++.h>
using namespace std;
using ll = long long;
#define rep(i,n) for (int i = 0; i < (int)(n); ++i)

int main() {
    int K, A, B;
    cin >> K >> A >> B;
    bool ans = false;
    int k = K * (A / K);
    while (k <= B) {
        if (A <= k && k <= B) {
            ans = true;
            break;
        }
        k += K;
    }
    if (ans) {
        cout << "OK" << endl;
    } else {
        cout << "NG" << endl;
    }
}