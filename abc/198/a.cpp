#include <bits/stdc++.h>
using namespace std;
using ll = long long;
#define rep(i,n) for (int i = 1; i <= (n); ++i)

int main() {
    int N;
    int pattern = 0;
    cin >> N;
    rep(i, N) {
        rep(j, N - i) {
            if (i + j == N)  {
                pattern++;
            }
        }
    }
    cout << pattern << endl;
}
