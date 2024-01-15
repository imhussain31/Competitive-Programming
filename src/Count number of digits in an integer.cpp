#include<iostream>
using namespace std;

class countDigit
{
public :

    int n  , i  ,counts =0;

    countDigit (int n)
    {
        this -> n = n;
    }

    void display ()
    {
        while (n !=0)
        {
         counts++;
         n/=10;
        }
        cout <<counts ;
    }
};

int main ()
{

    countDigit CD(12345);

    CD.display ();

}
