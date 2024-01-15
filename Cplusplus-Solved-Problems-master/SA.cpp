#include<bits/stdc++.h>
using namespace std;

void prime (int n)
{
    vector <int> x(n+1, true );

    x[0] = false;
    x[1] = false;

    int m = sqrt(n);

    for (int i = 2; i<=m; i++)
    {
        if (x[i])
        {
            for (int j = i*i; j<=n; j+=i)
            {
                x[j] = false;
            }
        }
    }
    for (int i = 0; i<=n; i++)
    {
        if (x[i])
        {
            cout << i << " ";
        }
    }
}

int main ()
{
    prime (10);
}
