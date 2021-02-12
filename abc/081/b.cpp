#include <bits/stdc++.h>
using namespace std;

int main() {
    int N;
    cin >> N;

    vector<int> A(N);
    for (int i = 0; i < N; i++) {
        cin >> A.at(i);
    }
    int count = 0;
    while (true) {
        bool ok = false;
        for (int i = 0; i < A.size(); i++) {
            if (A.at(i) % 2 == 0) {
                ok = true;
                A.at(i) = A.at(i) / 2;
            } else {
                ok = false;
                break;
            }
        }
        if (ok) {
            count++;
        } else {
            break;
        }
    }
    cout << count << endl;
}
