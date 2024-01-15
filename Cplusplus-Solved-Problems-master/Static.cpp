#include<iostream>
using namespace std;
class account
{
public :

    static float rateOfinterest;
    string name ;

    account (string name )
    {
        this ->name = name ;
    }

    void display ()
    {
        cout << name << " " << rateOfinterest  <<endl;
    }



};
float account :: rateOfinterest = 3.5;
int main ()
{
    account a1("Hussain");
    a1.display ();

}
