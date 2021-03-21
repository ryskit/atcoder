#include <bits/stdc++.h>
using namespace std;
using ll = long long;

ll f(ll x) {
    string s = to_string(x);
    return stoll(s+s);
}

int main() {
    ll N;
    cin >> N;
    ll x = 1;
    while (f(x) <= N) x++;
    ll ans = x - 1;
    cout << ans << endl;
    return 0;
}
