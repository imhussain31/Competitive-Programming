#include<bits/stdc++.h>
using namespace std;

int main ()
{
    int num, a, b, sum1 = 0, sum2 = 0;

    cin >> num;

    for (int i = 1; i<=num; i++)
    {
        cin >> a >> b;

        if(a > b)
            sum1+=a;
        if(a < b)
            sum2+=b;
    }
    if (sum1 > sum2)
        cout << "Mishka" <<endl;
    else if (sum2 > sum1)
        cout << "Chris" <<endl;
    else
        cout << "Friend is magic!^^" <<endl;
}


