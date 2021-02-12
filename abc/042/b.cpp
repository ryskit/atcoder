#include <bits/stdc++.h>
using namespace std;

int main() {
    // 文字列の数
    int N;
    // 文字列の長さ
    int L;
    cin >> N;
    cin >> L;

    // 文字列を格納する
    vector<string> words(N);

    for (int i = 0; i < N; i++) {
        cin >> words.at(i);
    }
    sort(words.begin(), words.end());

    string result;
    for (int i = 0; i < N; i++) {
        result += words.at(i);
    }
    cout << result << endl;
}
