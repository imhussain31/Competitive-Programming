#include<iostream>
using namespace std;

int main ()
{
    int num , i  , mul=1 ;

    cin >>num;

    while (num!=0)
    {
        mul *= num%10;

        num/=10;
    }

    cout <<mul;

}
