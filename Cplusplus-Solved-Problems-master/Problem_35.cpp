#include<bits/stdc++.h>
using namespace std;


int main ()
{
    int a , b ,c , n;

    cin >> n;

    for (int j = 1; j<=n; j++)
    {
    cin >> a >> b >>c;

    for (int i = 1; i<=c; i++)
    {
        if (i%a == 0)
        {
            if(i%b == 0)
            {
                cout << i <<endl;
            }
        }
    }
    }


}
