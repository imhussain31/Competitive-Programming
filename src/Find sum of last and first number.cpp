#include<iostream>
using namespace std;

int main ()
{
    int num , first , last , sum;

    cin >> num;

    first =  num ;

    while (first>=10)
    {
        first /= 10;
    }

    last = num%10;

    sum =  first + last ;

    cout <<"Sum of last and first digit: " << sum;



}
