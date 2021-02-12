#include <iostream>
using namespace std;

int ctoi(char x) {
    int tmp = -1;
    switch (x) {
        case '0': tmp = 0; break;
        case '1': tmp = 1; break;
        case '2': tmp = 2; break;
        case '3': tmp = 3; break;
        case '4': tmp = 4; break;
        case '5': tmp = 5; break;
        case '6': tmp = 6; break;
        case '7': tmp = 7; break;
        case '8': tmp = 8; break;
        case '9': tmp = 9; break;
    }
    return tmp;
}

int main() {
    int N;
    int A, B;
    cin >> N >> A >> B;
    int res = 0;
    for (int i = 1; i <= N; i++) {
        string s;
        s = to_string(i);
        int sum = 0;
        for (int j = 0; j < s.size(); j++) {
            sum += ctoi(s[j]);
        }
        if (A <= sum && sum <= B) res += i;
    }
    cout << res << endl;
}