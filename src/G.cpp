#include<bits/stdc++.h>
#include<iomanip>
using namespace std;

int main ()
{
    int n , i;
    double r;

    cin >> n;

    for (i=1; i<=n; i++)
    {
        cin >> r;
        cout <<"Case " << i <<": " <<fixed << setprecision(2)  <<4*r*r - M_PI*r*r << endl;
    }

}
