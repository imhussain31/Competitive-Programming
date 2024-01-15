#include<bits/stdc++.h>
using namespace std;


int main()
{
    int a,b,c,n , i;
    cin >> n;
    for(i=1;i<=n;i++)
    {
        cin >> a;
        b=a/2;
        c=a-b;
        cout << b << " " << c <<endl;
    }
    return 0;
}
