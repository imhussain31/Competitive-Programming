#include<iostream>
using namespace std;

class target
{
   public :

       int reverses=0, num ;

       target (int num )
       {
           this -> num =  num;
       }
    void display ()
    {

        while (num != 0)
        {
            reverses = (reverses * 10) + (num % 10);
        }

        num /=10;

        cout <<reverses;
    }


};


int main ()
{
    target tg(12345);

    tg.display ();
}
