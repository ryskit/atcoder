#include <bits/stdc++.h>
using namespace std;
using ll = long long;
#define rep(i,n) for (int i = 0; i < (n); ++i)

int main() {
    int N;
    cin >> N;
    vector<int>A(N);
    vector<int>B(N);
    rep(i, N) cin >> A[i];
    rep(i, N) cin >> B[i];
    set<int> target;

    for (int x = 1; x <= 1000; x++) {
        bool ok = true;
        rep(i, N) {
            if (!(A[i] <= x && x <= B[i])) {
                ok = false;
            }
        }
        if (ok) {
            target.insert(x);
        }
    }
    cout << target.size() << endl;
}
