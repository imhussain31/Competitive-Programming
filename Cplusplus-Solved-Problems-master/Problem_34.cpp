#include<bits/stdc++.h>
using namespace std;

int main ()
{
    int a , b , c , n;

    cin >> n;

    for (int j = 1; j<=n; j++){

    cin >> a >> b >> c;

    for (int i = a; i<=b; i++)
    {
       if (i%c == 0)
       {
           cout << i << endl;
       }
    }

    }



}
