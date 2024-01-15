#include<iostream>
using namespace std;

class Myclass
{
public :
    string name;
    int age;

    void display ()
    {
        cout << "Name :" <<name <<endl << "Age " <<age <<endl;
    }
};
class student : public Myclass
{
public :
    int id;

    void display1 ()
    {
        cout << "ID :" <<id <<endl;
        display ();
    }
};

int main ()
{
  student  MC;
  MC.age = 27;
  MC.name = "Hussain";
  MC.id = 1776;
  MC.display1 ();


}
