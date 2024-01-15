#include<bits/stdc++.h>
using namespace std;

int main ()
{
    int n , k;

    while (cin>> n >> k)
    {
        int r = 240 - k , sum  = 0 , c = 0;

        for (int i = 1; i<=n; i++)
        {
            sum+=5*i;

            if (sum > r)
                break;

            c++;
        }
        cout << c <<endl;
    }

}
