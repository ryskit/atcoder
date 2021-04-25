#include <bits/stdc++.h>
using namespace std;
using ll = long long;
#define rep(i,n) for (int i = 1; i <= (n); ++i)

int main() {
    int A, B, C;
    cin >> A >> B >> C;
    if ((A*A + B*B) < C*C) {
        cout << "Yes" << endl;
    } else {
        cout << "No" << endl;
    }
}
