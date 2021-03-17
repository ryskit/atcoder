#include <bits/stdc++.h>
using namespace std;

int main() {
    int N, Y;
    cin >> N >> Y;
    int A = -1, B = -1, C = -1;

    for (int a = 0; a <= N; a++) {
        for (int b = 0; b <= N - a; b++) {
            for (int c = 0; c <= N - b; c++) {
                int total = 10000 * a + 5000 * b + 1000 * c;
                if (a + b + c == N && total == Y) {
                    A = a;
                    B = b;
                    C = c;
                    break;
                }
            }
        }
    }
    cout << A << " " << B << " " << C;
}
