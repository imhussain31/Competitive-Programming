#include<bits/stdc++.h>
using namespace std;


int main ()
{
    int n , cnt = 0;

    float a;

    cin >> n;

    for (int i = 1; i<=n; i++)
    {
        cin >> a;

        while (a >= 0.1)
        {
            a = a/2;
            cnt++;
        }

        cout <<cnt  << " days"<<endl;
    }






}
