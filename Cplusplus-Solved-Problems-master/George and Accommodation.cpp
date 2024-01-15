#include<bits/stdc++.h>
using namespace std;

int main ()
{

    int n, i, p, q, cnt=0;

    cin >>n;

    for (i=1; i<=n; i++)
    {
        cin >> p >> q;

        if (q-p >= 2)
            cnt++;
    }
    cout << cnt <<endl;
}
