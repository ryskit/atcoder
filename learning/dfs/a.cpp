#include <iostream>
#include <vector>
using namespace std;
using Graph = vector<vector<int>>;

vector<bool> seen;

void dfs(const Graph &G, int v) {
    seen[v] = true; // v を訪問済みにする

    // vから行ける各頂点 next_v について
    for (auto next_v : G[v]) {
        if (seen[next_v]) continue;
        dfs(G, next_v); // 再帰的に探索
    }
}

int main() {
    // 頂点数と辺数、sとt
    int N, M, s, t;
    cin >> N >> M >> s >> t;

    Graph G(N);
    for (int i = 0; i < M; ++i) {
        int a, b;
        cin >> a >> b;
        G[a].push_back(b);
    }

    // 頂点 s をスタートとした探索
    seen.assign(N, false);
    dfs(G, s);
}
