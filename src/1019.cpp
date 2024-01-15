#include<iostream>
using namespace std;

int main ()
{
    int N ,hrs , m , sec;

    cin >>N;

    hrs = (N/3600 );

    N = (N%3600 );

    m = (N/60);

    sec = (N%60);

   cout <<hrs <<":" <<m <<":" <<sec <<endl;
}

