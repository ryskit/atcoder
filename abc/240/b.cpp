#include <bits/stdc++.h>
using namespace std;
using ll = long long;
#define rep(i, n) for (int i = 0; i < (int)(n); ++i)

int main()
{
  int N;
  set<int> S;
  cin >> N;
  rep(i, N)
  {
    int a;
    cin >> a;
    S.insert(a);
  }
  cout << S.size() << endl;
}