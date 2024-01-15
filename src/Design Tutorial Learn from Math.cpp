#include <bits/stdc++.h>
using namespace std;

int main ()
{
    int n , i = 0;

    cin >> n;

    if (n%2 == 0)
    {
        cout << n - 4 << " 4";
    }
    else
        cout << n - 9 << " 9";
}
