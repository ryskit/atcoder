#include <bits/stdc++.h>
using namespace std;
using ll = long long;
#define rep(i,n) for (int i = 0; i < (int)(n); ++i)

int main() {
    int N, M, Q;
    cin >> N >> M >> Q;

    // [
    //   [2]
    //   [1, 3]
    //   [2]
    // ]
    vector<vector<int>> graph(N);
    vector<int> color(N, 0);
    rep(i, M) {
        int u, v;
        cin >> u >> v;
        --u;
        --v;
        graph[u].push_back(v);
        graph[v].push_back(u);
    }

    rep(i, N) cin >> color.at(i);

    rep(i, Q) {
        int type;
        cin >> type;
        if (type == 1) {
            int x;
            cin >> x;
            cout << color[x-1] << endl;
            rep(i, graph[x-1].size()) {
                color[graph[x-1][i]] = color[x-1];
            }
        } else if (type == 2) {
            int x, y;
            cin >> x >> y;
            cout << color[x-1] << endl;
            color[x-1] = y;
        }
    }
    return 0;
}