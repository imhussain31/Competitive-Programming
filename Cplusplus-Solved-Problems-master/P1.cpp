#include<bits/stdc++.h>
using namespace std;

int main ()
{
    int n , ar1[100] , ar2[100];

    int a , b;

    cin >> n;

    for (int i = 1; i<=n; i++)
    {
        cin >> a >> b;

        for (int j = 1; j<=a; j++)
        {
            cin >> ar1[j];
        }
        for (int k = 1; k<=b; k++)
        {
            cin >> ar2[k];
        }

        int dp[100], current = 0;

        if (ar1[j] == ar2[k])
        {
            dp[j] = min(current+1 , dp[j]);
        }
        if (ar1[j] > ar2[k] )
        {
            current = min (current , dp[j]);
        }

        int result = min(dp);

        cout << result <<endl;

    }




}
