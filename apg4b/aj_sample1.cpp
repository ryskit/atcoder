#include <bits/stdc++.h>
using namespace std;

int main() {
    // int型10要素分をヒープ領域から確保(先頭のアドレスがpに入っている)
    int *p = new int[10];
    int *q = nullptr;
    cout << p << endl;

    for (int i = 0; i < 10; i++) {
        q = p + i;  // i番目の要素のポインタを取得
        cout << q << endl;
        *q = i;  // q の指す位置に i を書き込む
    }

    cout << q << endl;
    cout << p << endl;

    q = p;
    for (int i = 0; i < 10; i++) {
        cout << *q << endl;
        q++; // q = q + 1と同じ意味(次の要素を指すポインタに変更)
    }

    delete[] p;  // メモリ解放
}
