#include<bits/stdc++.h>
using namespace std;

int main ()
{
    int x , k , sum = 0;

    cin >> x >> k;

    for (int i = 0; i<=k; i++)
    {
        sum =sum + pow(x , i);
    }

    cout << sum <<endl;

}
