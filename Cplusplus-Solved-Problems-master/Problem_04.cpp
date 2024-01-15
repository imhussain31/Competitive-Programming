#include<bits/stdc++.h>
using namespace std;


int main ()
{

    int n , a;

    cin >> n;

    for (int i = 1; i<=n; i++)
    {
        cin >> a;


        cout << "case " << i << ": ";

        for (int j = 1; j<=a; j++)
        {
            if (a%j == 0)
                cout << j << " ";
        }cout <<endl;
    }





}
