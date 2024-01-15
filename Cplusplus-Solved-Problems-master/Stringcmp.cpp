#include<iostream>
#include<string.h>
using namespace std;

int main ()
{
    char str1[] = "Hussain";
    char str2[] = "Hussainh";

    int d;

    d = strcmp(str1 , str2);

    if (d == 0)
       cout << "String are equal." <<endl;
    else
      cout <<"String are not equal."<<endl;





}
