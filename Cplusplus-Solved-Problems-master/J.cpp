#include<bits/stdc++.h>
using namespace std;

int main ()
{
    int n , a , b ,i;

    cin >> n;
    if (n <=25){
    for (i=1; i<=n; i++)
    {
        cin >> a >> b;

        if (a == b)
            cout << "Case " << i <<": " << (19+a*4) <<endl;
        else if (a < b)
            cout << "Case " << i <<": " << (19+b*4) <<endl;
        else if (a > b)
            cout << "Case " << i <<": " << ((a - b + a)* 4 + 19 )<<endl;
    }
    }
}
