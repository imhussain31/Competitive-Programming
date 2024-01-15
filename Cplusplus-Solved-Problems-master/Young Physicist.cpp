#include<bits/stdc++.h>
using namespace std;

int main ()
{
    int i , n, x, y ,z , xsum = 0 , ysum = 0 , zsum = 0;

    cin >> n;

    for (i=1; i<=n; i++)
    {

        cin >> x>>y >>z;
        {
           xsum+=x;
           ysum+=y;
           zsum+=z;
        }

    }

    if (xsum == 0 && ysum == 0 && zsum == 0)
        cout << "YES" <<endl;
    else
        cout << "NO" <<endl;






}
