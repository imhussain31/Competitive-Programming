#include<bits/stdc++.h>
using namespace std;

int main ()
{
    int a , b;

    cin >> a >> b;

    if (a > b)
    {
        swap (a , b);
    }

    cout << a << " " << (b - a)/2 <<endl;
}