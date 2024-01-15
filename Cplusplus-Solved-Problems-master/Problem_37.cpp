#include<bits/stdc++.h>
using namespace std;

int main ()
{
    int a , last ,temp , rev = 0;

    cin >> a;

    temp = a;

    while (temp != 0)
    {
        rev = rev*10 + temp%10;
        temp/=10;
    }

    cout << rev <<endl;

}
