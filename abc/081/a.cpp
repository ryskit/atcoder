#include <bits/stdc++.h>
using namespace std;

int main() {
    string s;
    cin >> s;

    int result = 0;
    if (s[0] == '1') result++;
    if (s[1] == '1') result++;
    if (s[2] == '1') result++;
    cout << result << endl;
}
