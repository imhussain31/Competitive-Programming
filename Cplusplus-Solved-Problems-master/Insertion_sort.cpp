#include<bits/stdc++.h>
using namespace std;

int main ()
{
    int n ,x;

    cin >> n;

    int a[n];

    for (int i = 1; i<=n; i++)
    {
        cin >> a[i];

        int x = a[i];

        for (int j = i - 1; j>=1; j--)
        {
            if (a[j] > x)
            {
                a[j+1] = a[j];
                 j = j -1;
            }
            cout << a[j] << " ";
        }



    }



}
