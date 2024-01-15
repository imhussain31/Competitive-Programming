#include<bits/stdc++.h>
using namespace std;


int main ()
{
    int a, b, c,a1;

    while(cin >> a >> b >> c)
    {
        a1 = a+b+c;
        a1 = max(a1,(a*b*c));
        a1 = max(a1,(a+b)*c);
        a1 = max(a1,a*(b+c));
        a1 = max(a1,a+(b*c));
        a1 = max(a1,(a*b)+c);
        cout <<a1 <<endl;
    }



}
