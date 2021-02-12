#include <bits/stdc++.h>
using namespace std;

int main() {
    int five_count = 0;
    int seven_count = 0;
    int n;
    for (int i = 0; i < 3; i++) {
        cin >> n;
        if (n == 5) five_count++;
        if (n == 7) seven_count++;
    }

    if (five_count == 2 && seven_count == 1) {
        cout << "YES" << endl;
    } else {
        cout << "NO" << endl;
    }
}
