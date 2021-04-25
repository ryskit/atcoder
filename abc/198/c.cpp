#include <bits/stdc++.h>
using namespace std;
using ll = long long;
#define rep(i,n) for (int i = 0; i < (n); ++i)

int main() {
    ll R, X, Y;
    cin >> R >> X >> Y;
    ll d2 = X * X + Y + Y;
    ll ans = 1;
    while (true) {
        if (R*R*ans*ans >= d2) break;
        ++ans;
    }
    if (ans == 1) {
        if (R * R != d2) ans = 2;
    }
    cout << ans << endl;
    return 0;
}
