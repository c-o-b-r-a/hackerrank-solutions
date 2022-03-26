/* LINK - https://www.hackerrank.com/challenges/variable-sized-arrays/problem?isFullScreen=true */

#include <iostream>
#include <bits/stdc++.h>
using namespace std;

#define MAX_N 100000;
#define MAX_K 300000;

int main() {
    int n, q;
    vector<vector<long long int>> arr;

    cin >> n >> q;
    for (int i=0; i<n; i++){
        int k; cin >> k;
        
        for (int j=0; j<k; j++) {
            int num; cin >> num;
            arr[i].push_back(num);
        }
    }

    for (int t=0; t<q; t++){
        int i, j;
        cin >> i >> j;
        cout << arr[i][j] << "\n"; 
    }

    return 0;
}