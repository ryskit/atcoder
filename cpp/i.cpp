#include <bits/stdc++.h>
using namespace std;

// https://atcoder.jp/contests/apg4b/tasks/APG4b_i
int main() {
    int p;
    cin >> p;

    string text;
    // パターン2
    if (p == 2) {
        cin >> text;
    }

    int price;
    int N;
    cin >> price >> N;

    if (p == 2) {
        cout << text << "!" << endl;
    }
    cout << price * N << endl;
}
