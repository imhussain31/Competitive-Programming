#include<bits/stdc++.h>
using namespace std;

int main ()
{
    int n,a;

    cin >> n;

    for (int i = 1; i<=n; i++)
    {
        cin >> a;

        for (int i = 1; i<=a; i++ )
        {
            for (int k = 1; k<=a; k++)
            {
                cout << "*";
            }
            cout <<endl;

        }

    }

}
