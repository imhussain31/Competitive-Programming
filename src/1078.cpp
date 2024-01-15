#include<iostream>
using namespace std;

int main ()
{
    int num, i;

    cin >> num;

    if (num > 2 && num <1000)
    {
        for (i=1; i<=10; i++)
        {
            cout << i << " x " << num << " = " <<(i*num) <<endl;
        }
    }

}

