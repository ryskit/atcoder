#include <bits/stdc++.h>
using namespace std;

int main() {
    int N;
    cin >> N;
    vector<pair<int, int>> p(N);
    for (int i = 0; i < N; i++) {
        int x, y;
        cin >> x >> y;
        p.at(i) = make_pair(y, x);
    }
    sort(p.begin(), p.end());
    for (int i = 0; i < N; i++) {
        int b, a;
        tie(b, a) = p.at(i);
        cout << a << " " << b << endl;
    }
}