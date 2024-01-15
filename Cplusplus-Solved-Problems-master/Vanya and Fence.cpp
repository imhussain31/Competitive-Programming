#include<bits/stdc++.h>
using namespace std;

int main ()
{

    int a, n , h, cnt1 = 0  , cnt2 = 0;

    cin >> n >> h;

    for (int i = 1; i<=n; i++)
    {
        cin >> a;

        if (a > h)
        {
            cnt1+=2;
        }
        else
            cnt2++;
    }


    cout << cnt1 + cnt2 <<endl;

}
