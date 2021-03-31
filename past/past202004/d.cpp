#include <bits/stdc++.h>
using namespace std;
using ll = long long;
#define rep(i,n) for (int i = 0; i < (int)(n); ++i)


int main() {
    string S;
    cin >> S;

    set<string> matches;
    rep(i, S.size()) {
        matches.insert((string)S.substr(i, 1));
        matches.insert(to_string('.'));
    }

    rep(i, S.size() - 1) {
        string s = S.substr(i, 2);
        matches.insert(s);
        matches.insert(to_string(s[0]) + to_string('.'));
        matches.insert(to_string('.') + to_string(s[1]));
        matches.insert("..");
    }

    rep(i, S.size() - 2) {
        string s = S.substr(i, 3);
        matches.insert(s);
        matches.insert(to_string(s[0]) + to_string(s[1]) + to_string('.'));
        matches.insert(to_string(s[0]) + to_string('.') + to_string(s[2]));
        matches.insert(to_string('.') + to_string(s[1]) + to_string(s[2]));
        matches.insert(to_string(s[0]) + "..");
        matches.insert(to_string('.') + to_string(s[1]) + to_string('.'));
        matches.insert(".." + to_string(s[2]));
        matches.insert("...");
    }

    cout << matches.size() << endl;
}