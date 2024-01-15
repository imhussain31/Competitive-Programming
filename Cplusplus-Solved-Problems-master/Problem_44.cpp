#include<bits/stdc++.h>
using namespace std;


int main ()
{
    int num;

    cin >> num;

    for (int i = 1; i<=num; i++)
    {
        for (int j = 1; j<=i; j++)
        {
            if (i=j)
            {
                cout << i+i;
            }
        }cout << endl;
    }
}
