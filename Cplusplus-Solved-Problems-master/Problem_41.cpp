#include<bits/stdc++.h>
using namespace std;

int main ()
{
    float fac = 1 , sum = 0;

    int num;

    cin >> num;

    for  (int i = 1; i<=num; i++)
    {
       fac*=i;
       sum+=i/fac;;
    }

    cout <<sum <<endl;

}
