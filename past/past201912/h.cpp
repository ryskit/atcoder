#include <bits/stdc++.h>
using namespace std;
using ll = long long;
#define rep(i,n) for (int i = 0; i < (int)(n); ++i)
#define rep2(i,n) for (int i = 0; i < (int)(n); i+=2)

int main() {
    int N, Q;
    cin >> N;
    vector<ll> stock(N);
    ll type2Min = 1000000000;
    ll type3Min = 1000000000;
    ll type1Sell = 0;
    ll type2SellPerC = 0;
    ll type3SellPerC = 0;
    rep(i, N) {
        ll c;
        cin >> c;
        if (i % 2 == 0) {
            if (type2Min > c) {
                type2Min = c;
            }
        }
        if (type3Min > c) {
            type3Min = c;
        }
        stock[i] = c;
    }

    cin >> Q;
    rep(i, Q) {
        int typeNo;
        cin >> typeNo;

        if (typeNo == 1) {
            // 単品販売
            int x;
            ll a;
            cin >> x >> a;
            --x;
            ll cardX;
            if (x % 2 == 0) {
                cardX = stock[x] - type2SellPerC - type3SellPerC;
            } else {
                cardX = stock[x] - type3SellPerC;
            }
            if (cardX >= a) {
                stock[x] -= a;
                type1Sell += a;

                if (x % 2 == 0) {
                    if (type2Min > stock[x]) {
                        type2Min = stock[x];
                    }
                } else {
                    if (type3Min > stock[x]) {
                        type3Min = stock[x];
                    }
                }

            }
        } else if (typeNo == 2) {
            // セット販売
            ll a;
            cin >> a;
            if (type2Min - type2SellPerC - type3SellPerC >= a) {
                type2SellPerC += a;
            }
        } else if (typeNo == 3) {
            // 全種類販売
            ll a;
            cin >> a;
            ll tmpMin;
            if (type2Min - type2SellPerC - type3SellPerC > type3Min - type3SellPerC) {
                tmpMin = type3Min - type3SellPerC;
            } else {
                tmpMin = type2Min - type2SellPerC - type3SellPerC;
            }
            if (tmpMin >= a) {
                type3SellPerC += a;
            }
        }
    }
    ll ans = type1Sell;
    rep2(i, N) {
        ans += type2SellPerC;
    }
    ans += type3SellPerC * N;
    cout << ans << endl;
}