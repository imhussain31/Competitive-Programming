#include<bits/stdc++.h>
using namespace std;


int main ()
{
    int num , a , b;

    cin >> num;

    if (num < 0)
    {
        a = num/10;
        b = num/100 * 10 + num%10;
        cout << max (a , b) <<endl;
    }
    else if (num > 0)
    {
        cout << num <<endl;
    }
}
