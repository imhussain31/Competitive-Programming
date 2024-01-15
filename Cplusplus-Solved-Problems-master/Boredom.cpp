#include<bits/stdc++.h>
using namespace std;

int main ()
{
    long long  n, a[100005], sum1(0), sum(0);

    cin >> n;

    for (int i = 1; i<=n; i++)
    {
        cin >> a[i];

        if (a[i] == 2)
        {
            sum+=a[i];
        }
        else
            sum1+=a[i];

    }
    if (sum > sum1)
        cout << sum <<endl;
    else
        cout << sum1 <<endl;

}
