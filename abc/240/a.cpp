#include <bits/stdc++.h>
using namespace std;
using ll = long long;
#define rep(i, n) for (int i = 0; i < (int)(n); ++i)

int main()
{
  int a, b;
  cin >> a >> b;
  if (b - a == 1)
  {
    cout << "Yes" << endl;
  }
  else if (b == 10 && a == 1)
  {
    cout << "Yes" << endl;
  }
  else
  {
    cout << "No" << endl;
  }
}