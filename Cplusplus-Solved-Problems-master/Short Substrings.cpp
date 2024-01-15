#include<bits/stdc++.h>
using namespace std;

int main ()
{
    int t;

    cin >> t;

    for (int test = 1; test <=t; test++)
    {
        string b;

        cin >> b;

        string a = b.substr(0,2);

        for (int i = 3; i<b.size(); i+=2)
        {
            a+=b[i];
        }

        cout << a <<endl;
    }





}
