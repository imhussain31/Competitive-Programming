#include <iostream>
#include<iomanip>
using namespace std;

int main()
{
    double a,b,c=1,d=3,e,f;
    int x;
    for(a=0; a<=1.9; a=a+.2)
    {
        for(b=1.0; b<=3.0; b++)
        {
            e=b+a;
            if(a==0.0||a==1.0) cout  <<"I="  <<setprecision(1) <<a <<" " <<"J=" <<setprecision(1) <<e <<endl;
            else if(e==3.0||e==4.0||e==5.0) cout <<"I=" <<setprecision(1) <<a <<" " <<"J=" <<setprecision(1) <<e  <<endl;
            else  cout <<"I=" <<setprecision(2) <<a  <<" " <<"J=" <<setprecision(2) <<e  <<endl;
        }
    }
    for(x=3; x<=5; x++) cout <<"I=2" <<" " <<"J=" <<x <<endl;
    return 0;
}

