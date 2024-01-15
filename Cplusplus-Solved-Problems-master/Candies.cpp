#include<bits/stdc++.h>
using namespace std;


int main ()
{
    int t , k , x ,series;

    cin >> t;

    for (int i = 1; i<=t; i++)
    {
        cin >> k;

        if (k%i == 0)
        {
            x = i;
        }

        series = 1*x + 2*x + 4*x ;


        if (series == k)
        {
            cout << x;
        }

    }




}
