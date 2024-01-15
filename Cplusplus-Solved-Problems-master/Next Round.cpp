#include<bits/stdc++.h>
using namespace std;

int main ()
{
    int n , k , cnt = 0;

    cin >> n >> k;

    int a[n];

    for (int i = 1; i<=n; i++)
    {
        cin >> a[i];
    }

    for (int i =1; i<=n; i++)
    {
        if (a[i] >= a[k] && a[i] > 0)
        {
            cnt++;
        }

    }

    cout << cnt <<endl;




}
