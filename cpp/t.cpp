#include <bits/stdc++.h>
using namespace std;

int main() {
    int N, M;
    cin >> N >> M;
    vector<int> A(M), B(M);
    for (int i = 0; i < M; i++) {
        cin >> A.at(i) >> B.at(i);
    }
    vector<vector<char>> result(N, vector<char>(N, '-'));
    for (int i = 0; i < M; i++) {
        int win = A.at(i);
        int lose = B.at(i);
        result.at(win-1).at(lose - 1) = 'o';
        result.at(lose - 1).at(win - 1) = 'x';
    }
    for (int i = 0; i < result.size(); i++) {
        vector<char> row = result.at(i);
        for (int j = 0; j < row.size(); j++) {
            if (j != N - 1)
                cout << row.at(j) << " ";
            else
                cout << row.at(j) << endl;
        }
    }
}
