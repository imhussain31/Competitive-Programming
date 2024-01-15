#include<bits/stdc++.h>
using namespace std;

int main ()
{
    int t , a , b , c , d , e , s , result;

    cin >> t;

    while (t--)
    {
        cin >> a >> b >> c >>d;

        e = c*60+d;

        s = a*60+b;

        result = e - s;

        cout << result/60 << " " <<result%60 <<endl;
    }



}
