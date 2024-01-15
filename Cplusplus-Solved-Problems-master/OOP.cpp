#include <iostream>
using namespace std;
class Myclass
{
public :
    string name;
    string BOD;

    Myclass (string name ,string BOD)
    {
        this -> name = name ;
        this -> BOD = BOD;
    }

    void display ()
    {
        cout << "Name :"<<name <<endl << "Date of Birth :"  <<BOD <<endl;
    }

};
class student : public Myclass
{
public :
    int id;

    Myclass (int id)
    {
       this -> id = id ;
    }

    void display1 ()
    {
        cout << "ID :" <<id <<endl;
        display ();
    }

};
int main ()
{
  student st ("Hussain", "18/09/1999", 1776);
  st.display1();

}
