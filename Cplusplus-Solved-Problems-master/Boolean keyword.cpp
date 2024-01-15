#include<bits/stdc++.h>
using namespace std;

int main ()
{
    int x1 = 10 , x2 =20 , m = 2;

    bool b1 , b2 ;

    b1 = x1 == x2;

    b2 = x1 < x2;

    cout << "B1 is :" << b1 <<endl;
    cout << "B2 is :" <<b2 <<endl;

    bool b3 = true ;

    if (b3)
        cout << "YES" <<endl;
    else
        cout << "NO" <<endl;

    int x3 = false + 5*m - b3;

    cout << x3 << endl;


}
