#include <bits/stdc++.h>
using namespace std;

int main() {
    int N;
    cin >> N;

    map<int, int> A;
    for (int i = 0; i < N; i++) {
        int x;
        cin >> x;
        A[x] += 1;
    }

    int max_number = 0;
    int max_count = 0;
    for (auto a : A) {
        if (a.second > max_count) {
            max_number = a.first;
            max_count = a.second;
        }
    }

    cout << max_number << " " << max_count << endl;
}