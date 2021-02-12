#include <bits/stdc++.h>
using namespace std;

int main() {
    int N;
    cin >> N;
    set<int> s;

    for (int i = 0; i < N; i++) {
        int d;
        cin >> d;
        s.insert(d);
    }
    cout << s.size() << endl;
}
