#include<bits/stdc++.h>
using namespace std;


int main ()
{
    int i , n , a , cn= 0;

    cin >> n;

    for (i=1; i<=n; i++)
    {
        cin >> a;

    }
    for (i=1; i<=n; i++)
    {
        int cnt = 0;

        sort (a , a+1);

        cnt+=a;

        if (cnt==4)
            cn++;
    }

    cout <<cn;



}
