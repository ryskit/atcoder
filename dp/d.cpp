#include <bits/stdc++.h>
using namespace std;
using ll = long long;
#define rep(i,n) for (int i = 0; i < (int)(n); ++i)
template<class T> inline bool chmax(T& a, T b) { if (a < b) { a = b; return true; } return false; }
template<class T> inline bool chmin(T& a, T b) { if (a > b) { a = b; return true; } return false; }
const long long INF = 1LL<<60;

int N;
ll W, weight[110], value[110];

ll dp[110][100100] = {0};

// https://atcoder.jp/contests/dp/tasks/dp_d
int main() {
    cin >> N >> W;
    rep(i, N) cin >> weight[i] >> value[i];

    rep(i, N) {
        for (int sum_w = 0; sum_w <= W; ++sum_w) {
            // i番目の品物を選ぶ場合
            if (sum_w - weight[i] >= 0) {
                chmax(dp[i+1][sum_w], dp[i][sum_w - weight[i]] + value[i]);
            }
            // i番目の品物を選ばない場合
            chmax(dp[i+1][sum_w], dp[i][sum_w]);
        }
    }

    cout << dp[N][W] << endl;
}
