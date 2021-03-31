#include <bits/stdc++.h>
using namespace std;
using ll = long long;
#define rep(i,n) for (int i = 0; i < (int)(n); ++i)

int main() {
    int a, b, c;
    cin >> a >> b >> c;
    set<int> s;
    s.insert(a);
    s.insert(b);
    s.insert(c);
    cout << s.size() << endl;
}