#include <bits/stdc++.h>
using namespace std;

int main() {
    int H, W, X, Y;
    cin >> H >> W >> X >> Y;
    vector<string> S(H);
    for (int h = 0; h < H; ++h) {
        string s;
        cin >> s;
        S[h] = s;
    }

    int count = 1;

    // y left を調べる
    for (int yl = Y - 2; yl >= 0; --yl) {
        char c = S[X - 1][yl];
        if (c == '.') {
            count++;
        } else if (c == '#') {
            break;
        }
    }

    // y right を調べる
    for (int yr = Y; yr < W; ++yr) {
        char c = S[X - 1][yr];
        if (c == '.') {
            count++;
        } else if (c == '#') {
            break;
        }
    }

    // x up を調べる
    for (int xu = X - 2; xu >= 0; --xu) {
        char c = S[xu][Y-1];
        if (c == '.') {
            count++;
        } else if (c == '#') {
            break;
        }
    }

    // x down を調べる
    for (int xd = X; xd < H; ++xd) {
        char c = S[xd][Y-1];
        if (c == '.') {
            count++;
        } else if (c == '#') {
            break;
        }
    }

    cout << count << endl;
    return 0;
}
