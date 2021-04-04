#include <bits/stdc++.h>
using namespace std;
using ll = long long;
#define rep(i,n) for (int i = 0; i < (int)(n); ++i)

vector<string> fields;
vector<vector<bool>> visited;
int H, W, sh, sw, gh, gw;
const int dx[4] = {1, 0, -1, 0};
const int dy[4] = {0, 1, 0, -1};

void dfs(int h, int w) {
    visited[h][w] = true;
    rep(i, 4) {
        int x = dx[i];
        int y = dy[i];
        int next_x = w+x;
        int next_y = h+y;
        if (0 > next_x || 0 > next_y || next_x >= W || next_y >= H) continue;
        if (fields[next_y][next_x] == '#') continue;
        if (!visited[next_y][next_x]) {
            dfs(next_y, next_x);
        }
    }
}

int main() {
    cin >> H >> W;
    fields = vector<string>(H);
    rep(i, H) cin >> fields[i];
    rep(h, H) {
        rep(w, W) {
            if (fields[h][w] == 's') {
                sh = h;
                sw = w;
            }
            if (fields[h][w] == 'g') {
                gh = h;
                gw = w;
            }
        }
    }

    visited = vector<vector<bool>>(H, vector<bool>(W, false));
    dfs(sh, sw);

    if (visited[gh][gw]) {
        cout << "Yes" << endl;
    } else {
        cout << "No" << endl;
    }
}