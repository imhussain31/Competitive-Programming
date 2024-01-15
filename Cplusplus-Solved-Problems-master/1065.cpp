#include <iostream>
using namespace std;

int main ()
{
    int i , num , counts = 0;

    for (i = 0 ; i < 5; i++)
    {
        cin >> num;
        if (num < 0 )
        {
            num = -num;
        }
        {
             if ( num % 2 == 0)
             counts++;
        }


    }

    cout <<counts <<" valores pares" <<endl;

}

