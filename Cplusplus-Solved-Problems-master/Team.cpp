#include<bits/stdc++.h>
using namespace std;

int main ()
{

    int n , a , b , c , i ,con = 0;

    scanf ("%d", &n);

    for (i=1; i<=n; i++)
    {
        scanf ("%d%d%d", &a , &b , &c);

        if ((a == 1 && b == 1) || (a == 1 && c == 1)  || (c == 1 && b == 1) )
        {
            con++;
        }

    }
    printf ("%d\n", con);





}
