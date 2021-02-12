#include <bits/stdc++.h>
using namespace std;

int main() {
    int N;
    cin >> N;

    vector<int> A(N);
    for (int i = 0; i < N; i++) {
        cin >> A.at(i);
    }
    sort(A.begin(), A.end(), greater<int>());

    int Alice = 0, Bob = 0;
    for (int i = 0; i < A.size(); i++) {
        if (i % 2 == 0) {
            Alice += A.at(i);
        } else {
            Bob += A.at(i);
        }
    }

    cout << Alice - Bob << endl;
}