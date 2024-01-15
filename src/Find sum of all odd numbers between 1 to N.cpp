#include<iostream>
using namespace std;

int main ()
{
    int i , n, sum  =0;

    cout <<"Enter any number :";
    cin>> n;

    for (i=1; i<n; i+=2)
    {
        sum = sum + i;
    }
    cout <<sum <<endl;
}
