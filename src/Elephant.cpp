#include<bits/stdc++.h>
using namespace std;

int main ()
{
    int x , p = 0 , q = 0 , r = 0 , s = 0 , t = 0 , u  = 0;

    cin >> x;

    p = x/5;

    q = x%5;


    if (q%4 == 0)
    {
        r = q/4;
    }
    else if (q%3 == 0)
    {
        s = q/3;
    }
    else if (q%2 == 0)
    {
        t = q/2;
    }
    else if (q%1 == 0)
    {
        u = q/1;
    }

    cout << p+r+s+t+u <<endl;






}
