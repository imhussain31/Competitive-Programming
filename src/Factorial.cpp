#include<bits/stdc++.h>
using namespace std;

int main ()
{
    int n , fac = 1;

    cin >> n;

    for (int i = n; i>=1; i--)
    {
        fac*=i;
    }

    cout << fac <<endl;
}
