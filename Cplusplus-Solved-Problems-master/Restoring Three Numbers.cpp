#include<bits/stdc++.h>
using namespace std;

int main ()
{
    int a[4] , ar , b , c;

    for (int i = 0; i<4; i++)
    {
    cin >> a[i];
    }
    for (int i = 0; i<4; i++)
    {
    sort (a , a+4);

    ar = a[3] - a[0];
    b = a[3] - a[2];
    c = a[3] - a[1];

    }
    cout <<ar << " " <<b << " " << c <<endl;;







}
