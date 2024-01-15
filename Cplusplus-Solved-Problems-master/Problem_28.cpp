#include<bits/stdc++.h>
using namespace std;

int main ()
{
    int num , r , sum = 0 , temp;

    cin >> num;

    temp = num;

    while (temp!=0)
    {
        r = temp%10;

        sum = sum + r*r*r;

        temp = temp/10;
    }

    if (sum == num)
        cout << "Armstrong Number " <<endl;
    else
        cout << "Not Armstrong Number" <<endl;





}
