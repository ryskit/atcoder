#include <bits/stdc++.h>
using namespace std;
using ll = long long;
#define rep(i,n) for (int i = 0; i < (n); ++i)

string nzero(string n, int count) {
    if (count == 0) {
        return n;
    }
    return nzero("0" + n, count -1);
}

int main() {
    string N;
    cin >> N;
    int nsize = N.size();
    bool ans = false;
    rep(i, nsize) {
        bool palindrome = true;
        string tmp_n = nzero(N, i);
        int tmp_n_size = tmp_n.size();
        rep(j, tmp_n_size / 2) {
            if (tmp_n[j] != tmp_n[tmp_n_size - 1 - j]) {
                palindrome = false;
                break;
            }
        }
        if (palindrome) {
            ans = true;
        }
    }
    if (ans) {
        cout << "Yes" << endl;
    } else {
        cout << "No" << endl;
    }
}
