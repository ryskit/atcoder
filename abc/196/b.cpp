#include <bits/stdc++.h>
using namespace std;

int main() {
    string X;
    cin >> X;
    string result;
    for (int i = 0; i < X.size(); i++) {
        if (X.at(i) == '.') {
            break;
        }
        result += X.at(i);
    }
    cout << result << endl;
}