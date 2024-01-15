#include<bits/stdc++.h>
using namespace std;


int main ()
{
    int p , q , c , mod , ans;

    cin >> p >> q >> c;

    ans = pow(p , q);

    mod = ans%c;

    cout << mod <<endl;

}
