#include <bits/stdc++.h>
using namespace std;
using ll = long long;
#define rep(i,n) for (int i = 0; i < (n); ++i)

int main() {
    vector<int> candy(3);
    int max = 0;
    int max_idx = 999999;
    rep(i, 3) {
        cin >> candy[i];
        if (max < candy[i]) {
            max = candy[i];
            max_idx = i;
        }
    }

    int sum = 0;
    rep(i, 3) {
        if (max_idx != i) {
            sum += candy[i];
        }
    }

    if (max == sum) {
        cout << "Yes" << endl;
    } else {
        cout << "No" << endl;
    }
}

