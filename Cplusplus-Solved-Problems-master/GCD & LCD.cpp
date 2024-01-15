#include<bits/stdc++.h>
using namespace std;

int main ()
{
    int num1 , num2 , temp , n1 , n2;

    cin >> num1 >> num2;

    num1 = n1;
    num2 = n2;

    while (n2!=0)
    {
        temp = n1 % n2;
        n1 = n2;
        n2 = temp;
    }

    cout << n1 <<endl;

    cout << (num1*num2)/n1 <<endl;





}
