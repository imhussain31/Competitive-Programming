#include<bits/stdc++.h>
using namespace std;


int main ()
{
    int n ,l;

    char a[100];

    cin >> n;

    for (int i = 1; i<=n; i++)
    {
        cin >> a[i];

        l = strlen (a);

        int cnt  = 0;

        for (int j = 1; j<=l; j++)
        {
            cnt++;
            cout << cnt <<endl;
        }

    }
}
