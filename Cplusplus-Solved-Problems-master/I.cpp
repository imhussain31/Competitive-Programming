#include <bits/stdc++.h>
using namespace std;

int main()
{
    unsigned int a,b,c,n,i,side1,side2;

    cin >> n;

    for(i=1; i<=n; i++)
    {
        cin >>a >>b >>c;

        if(a>b && a>c)
        {
            side1=a*a;
            side2=b*b+c*c;
        }
        else if(b>a && b>c)
        {
            side1=b*b;
            side2=a*a+c*c;
        }
        else if(c>a && c>b)
        {
            side1=c*c;
            side2=a*a+b*b;
        }
        if(side1 == side2)
            cout << "Case " << i << ": yes" << endl;
        else
            cout << "Case " << i << ": no" << endl;
    }
    return 0;
}

