#include<bits/stdc++.h>
using namespace std;

int main ()
{
    int a[100] , n;

    long long int product = 1;

    int module = pow(10,9) + 7;

    cin >> n;

    for (int i = 1; i<=n; i++ )
    {
        cin >> a[i];
        product*=a[i]%module;
    }

    cout << product << endl;
}
