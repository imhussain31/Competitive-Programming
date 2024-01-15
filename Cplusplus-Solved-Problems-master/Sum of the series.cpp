#include<bits/stdc++.h>
using namespace std;

int main ()
{
    int n , sum = 0;

    cin >> n;

    for (int i = 1; i<=n; i++)
    {
        if (i == 1)
        {
            cout << "1";
        }

        else if (i%2 == 0)
        {
            cout << "-1/" << i ;
        }
        else
        {
            cout << "+1/" << i;
        }
    }




}
