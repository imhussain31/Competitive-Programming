#include<bits/stdc++.h>
using namespace std;

int main ()
{
    int num , sum = 0;

    cin >> num;

    for (int i = 1; i<num; i++)
    {
        if (num%i == 0)
        {
            sum+=i;
        }
    }
    if (sum == num)
    {
        cout << "Yes" <<endl;
    }

    else
        cout << "No" <<endl;




}
