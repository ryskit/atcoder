#include <bits/stdc++.h>
using namespace std;

int main() {
    int N, A;
    cin >> N >> A;
    string op;
    int x;

    for (int i = 1; i <= N; i++) {
        cin >> op >> x;
        if (op == "+") {
            A += x;
        }
        else if (op == "-") {
            A -= x;
        }
        else if (op == "*") {
            A *= x;
        }
        else if (op == "/") {
            if (x == 0) {
                cout << "error" << endl;
                break;
            } else {
                A /= x;
            }
        }
        cout << i << ":" << A << endl;
    }
}

