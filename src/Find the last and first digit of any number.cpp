#include<iostream>
using namespace std;

int main ()
{
    int num , last , first ;

    cin >> num;

    first =  num;

    while (first >= 10)
    {
        first /= 10;
    }

    last =  num % 10;

    cout << first <<last;


}
