#include <bits/stdc++.h>
using namespace std;
using ll = long long;
#define rep(i,n) for (int i = 0; i < (n); ++i)

int main() {
    int N;
    cin >> N;
    vector<int> a(N);
    rep(i, N) cin >> a[i];
    int ans = 1<<30;
    rep(s,1<<(N-1)) {
        int now = 0;
        int o = 0;
        rep(i,N) {
            o |= a[i];
            if (s>>i&1) {
                now ^= o;
                o = 0;
            }
        }
        now ^= o;
        ans = min(ans, now);
    }
    cout << ans << endl;
    return 0;
}
