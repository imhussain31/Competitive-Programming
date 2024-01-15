#include<bits/stdc++.h>
using namespace std;

int main ()
{
    int  k ,n, w,ans;

    cin >> k >> n>>w;

    w = w* (w+1)/2;

    ans = w*k-n;

    if (ans <= 0)ans  = 0;

    cout << ans <<endl;
}
