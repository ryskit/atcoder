#include <bits/stdc++.h>
using namespace std;
using ll = long long;
#define rep(i,n) for (int i = 0; i < (int)(n); ++i)
template<class T> inline bool chmax(T& a, T b) { if (a < b) { a = b; return 1; } return 0; }
template<class T> inline bool chmin(T& a, T b) { if (a > b) { a = b; return 1; } return 0; }

int main() {
    int R, C, sy, sx, gy, gx;
    cin >> R >> C >> sy >> sx >> gy >> gx;
    --sy, --sx, --gy, --gx;
    vector<string> fields(R);
    rep(i, R) cin >> fields[i];

    int dx[4] = { 1, 0, -1, 0 };
    int dy[4] = { 0, 1, 0, -1 };

    vector<vector<int>> dist(R, vector<int>(C, -1));
    queue<pair<int, int>> Q;
    Q.push({sy, sx});
    dist[sy][sx] = 0;

    while(!Q.empty()) {
        auto current = Q.front();
        Q.pop();
        rep(i, 4) {
            int y = current.first;
            int x = current.second;
            int next_y = dy[i] + y;
            int next_x = dx[i] + x;
            if (0 > next_y || 0 > next_x || next_y >= R || next_x >= C) continue;
            if (fields[next_y][next_x] == '#') continue;

            if (dist[next_y][next_x] == -1) {
                Q.push({next_y, next_x});
                dist[next_y][next_x] = dist[y][x] + 1;
            }
        }
    }
    cout << dist[gy][gx] << endl;
}