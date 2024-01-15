#include<bits/stdc++.h>
using namespace std;

int main ()
{
    int n , p , q, cnt = 0 ;

    cin >> n >> p >> q;

    int a[n];

    for (int i = 1; i<=p; i++)
    {
        cin >> a[i];
    }
    for (int i = p; i<=q; i++)
    {
        cin >> a[i];
    }

    sort ( a , a+(p+q));

    for (int i = 0; i<p+q; i++)
    {
        if (a[i] != a[i+1])
            cnt++;
    }

    if (n == cnt )
        cout << " I wanna be the guy." <<endl;
    else
        cout << "Oh , my keyword" <<endl;



}
