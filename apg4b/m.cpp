#include <bits/stdc++.h>
using namespace std;

int main() {
    string S;
    cin >> S;

    // ここにプログラムを追記
    int sum = 1;
    char op;
    for (int i = 1; i < S.size(); i++) {
        if (i % 2 == 0) {
            if (op == '+') {
                sum++;
            } else if (op == '-') {
                sum--;
            }
        } else {
            op = S.at(i);
        }
    }
    cout << sum << endl;
}
