#include <bits/stdc++.h>
using namespace std;
using ll = long long;
#define rep(i,n) for (int i = 0; i < (int)(n); ++i)
template<class T> inline bool chmax(T& a, T b) { if (a < b) { a = b; return 1; } return 0; }
template<class T> inline bool chmin(T& a, T b) { if (a > b) { a = b; return 1; } return 0; }


int main() {
    int N;
    vector<int> H;
    vector<int> cost;

    cin >> N;
    H = vector<int>(N);
    rep(i, N) cin >> H[i];
    cost = vector<int>(N);
    cost[0] = 0;
    cost[1] = cost[0] + abs(H[0]-H[1]);
    for (int i = 2; i < N; i++) {
        int min;
        if (cost[i-1] + abs(H[i-1]-H[i]) > cost[i-2] + abs(H[i-2]-H[i])) {
            min = cost[i-2] + abs(H[i-2]-H[i]);
        } else {
            min = cost[i-1] + abs(H[i-1]-H[i]);
        }
        cost[i] = min;
    }
    cout << cost[N-1] << endl;
}