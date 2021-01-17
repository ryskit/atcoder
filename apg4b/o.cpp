#include <bits/stdc++.h>
using namespace std;

int main() {
    int A, B, C;
    cin >> A >> B >> C;
    vector<int> heights = {A, B, C};
    sort(heights.begin(), heights.end());

    int diff = heights[2] - heights[0];
    cout << diff << endl;
}
