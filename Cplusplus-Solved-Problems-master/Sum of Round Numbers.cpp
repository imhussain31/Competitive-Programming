#include<bits/stdc++.h>
using namespace std;

int main ()
{
    int n , a;

    cin >> n;

    while (n--)
    {
        cin >> a;

        int r = a%10;

        if (r == 0)
            cout << a <<endl;
        else
        {
            cout << a - r << " " << r <<endl;
        }
    }
}
