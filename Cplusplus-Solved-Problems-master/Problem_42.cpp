#include<bits/stdc++.h>
using namespace std;


int main ()
{
    int num , a;

    cin >> num >> a;

    for (int i = num; i>=1; i--)
    {
        if (i == 1) cout << "+1" <<endl;
        else if ( i == 2) cout << "2";
        else if (i == 2)
            cout << "2^" << i  << "+";
    }



}
