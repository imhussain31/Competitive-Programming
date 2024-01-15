///Encapsulation.
///Use of getter and setter method.
#include<iostream>
using namespace std;

class Encapsulation
{
private :

    string name;

public :

    void setName (string x)
    {
        name = x;
    }

    string getName ()
    {
        return name ;
    }

} ;

int main()
{
    Encapsulation En;
    En.setName ("Hussain");
    cout << En.getName();



}
