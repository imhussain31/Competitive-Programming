#include<bits/stdc++.h>
using namespace std;

int main ()
{
    int a, n , sum ,first , last;

    cin >> n;

    for (int i = 1; i<=n; i++)
    {
        cin >> a;

        first = a;

        while (first >= 10 )
        {
            first /= 10;
        }

        last = a%10;

        sum = first + last;

        cout << "sum = " <<sum <<endl;
    }


}
