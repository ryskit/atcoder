#include <bits/stdc++.h>
using namespace std;
using ll = long long;
#define rep(i,n) for (int i = 0; i < (n); ++i)
template<class T> inline bool chmax(T& a, T b) { if (a < b) { a = b; return 1; } return 0; }
template<class T> inline bool chmin(T& a, T b) { if (a > b) { a = b; return 1; } return 0; }
int INF = 1000000007;

int main() {
    int N, L;
    int T1, T2, T3;
    cin >> N >> L;
    vector<bool> hurdles(L+1, false);
    rep(i, N) {
        int x;
        cin >> x;
        hurdles[x] = true;
    }
    cin >> T1 >> T2 >> T3;

    vector<int> dp(L+5, INF);
    dp[0] = 0;
    rep(i, L) {
        if (hurdles[i]) {
            dp[i] += T3;
        }
        dp[i+1] = min(dp[i+1], dp[i] + T1);
        dp[i+2] = min(dp[i+2], dp[i] + T1 + T2);
        dp[i+4] = min(dp[i+4], dp[i] + T1 + T2 * 3);
    }

    int ans = dp[L];
    ans = min(ans, dp[L-1] + (T1 + T2)/2);
    ans = min(ans, dp[L-2] + T1/2 + T2*3/2);
    if (L > 2) {
        ans = min(ans, dp[L-3] + T1/2 + T2*5/2);
    }
    cout << ans << endl;
    return 0;
}

