#include <bits/stdc++.h>
using namespace std;

int main() {
    int N;
    cin >> N;
    vector<int> scores(N);
    int sum = 0;
    for (int i = 0; i < N; i++) {
        int score;
        cin >> score;
        sum += score;
        scores[i] = score;
    }
    int average = sum / N;
    for (int i = 0; i < N; i++) {
        cout << abs(average - scores[i]) << endl;
    }
}
