#include<bits/stdc++.h>
using namespace std;

int main ()
{
    int a , ar , mul = 2;

    for (int i = 1; i<=3; i++)
    {
        cin >> a;

        if (a%2 == 0)
        {
            ar = a/2;
            mul *= ar;
        }
        else
        {
           mul*=a;
        }

    }

    cout <<mul << endl;


}
