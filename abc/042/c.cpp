#include <bits/stdc++.h>
using namespace std;

int main() {
    // N円の商品価格
    string N;

    // 嫌いな数字 K個
    int K;

    cin >> N;
    cin >> K;

    map<char, bool> D;
    for (int i = 0; i < K; i++) {
        char c;
        cin >> c;
        D[c] = true;
    }

    string result;

    int n = stoi(N);
    while (true) {
        bool ok = true;
        string n_s = to_string(n);
        for (int i = 0; i < n_s.size(); i++) {
            if (D[n_s.at(i)]) ok = false;
        }
        if (ok) break;
        n++;
    }
    cout << n << endl;
}
