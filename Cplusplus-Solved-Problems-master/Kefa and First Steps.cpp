#include<bits/stdc++.h>
using namespace std;

int main ()
{
    int n,cnt = 1,l = 1;

    cin >> n;

    int a[n];

    for (int i=0; i<n; i++)
    {
        cin >>a[i];
        if ( i > 0)
            if (a[i] >= a[i-1])
            {
                l++;
                cnt = max (cnt, l );
            }
        else
            l = 1;
    }


    cout << cnt <<endl;









}
