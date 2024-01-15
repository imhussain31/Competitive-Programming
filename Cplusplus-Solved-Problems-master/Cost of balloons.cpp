#include<bits/stdc++.h>
using namespace std;

int main ()
{
    int t;

    cin >> t;

    while (t--)
    {
        int a , b , x = 0, y = 0 , n;

        cin >> a >> b;

        cin >> n;

        for (int i = 1; i<=n; i++)
        {
            int l ,m;

            cin >> l >>m;

            if (l == 1)
            {
                x++;
            }
            if (m == 1)
            {
                y++;
            }

        }

        int price1 = 0 , price2 = 0;

        price1 = x*a + y*b;

        price2 = x*b + y*a;

        if (price1 < price2 )
            cout << price1 <<endl;
        else
            cout << price2 <<endl;
    }



}
