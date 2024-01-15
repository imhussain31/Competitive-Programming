#include<bits/stdc++.h>
using namespace std;

int main ()
{
    int t , a , b , n ,ans;

    cin >> t;

    while (t--)
    {
        cin >> a >> b >> n;

       if (n - n % a+b <= n)
        cout << n - n % a+b <<endl;
       else
        cout << n - n % a - (a - b) <<endl;


    }
}
