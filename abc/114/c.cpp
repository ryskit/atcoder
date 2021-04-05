#include <bits/stdc++.h>
using namespace std;
using ll = long long;
#define rep(i,n) for (int i = 0; i < (int)(n); ++i)
template<class T> inline bool chmax(T& a, T b) { if (a < b) { a = b; return 1; } return 0; }
template<class T> inline bool chmin(T& a, T b) { if (a > b) { a = b; return 1; } return 0; }



int main() {
    ll N;
    cin >> N;
    string available[3] = { "3", "5", "7" };
    int ans = 0;
    queue<string> que;
    que.push("3");
    que.push("5");
    que.push("7");
    while (!que.empty()) {
        string current = que.front();
        que.pop();
        if (N >= stoll(current)) {
            if (current.find('3') != std::string::npos && current.find('5') != std::string::npos && current.find('7') != std::string::npos) {
                ans += 1;
            }
            rep(i, 3) {
                string next = current + available[i];
                que.push(next);
            }
        }
    }
    cout << ans << endl;
}