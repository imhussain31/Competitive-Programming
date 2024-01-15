#include <bits/stdc++.h>
using namespace std;

int main ()
{
    int n, a, b,i;

    cin >> n;

    if (n <= 125)
    {
        for (i = 1; i<=n; i++)
        {
            cin >>a >>b;

            if (0 > a <=10 && 0 > b <=10)
                cout << "Case " <<i <<": " << a+b <<endl;
        }
    }

    return 0;
}
