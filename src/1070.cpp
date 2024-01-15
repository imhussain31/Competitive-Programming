#include<iostream>
using namespace std;

int main ()
{
    int i, num;

    cin >> num;

    if (num%2==0)
        num++;

    for (i=0; i <6; i++ )
    {
        cout <<num <<endl;
        num+=2;
    }

    return 0;
}
