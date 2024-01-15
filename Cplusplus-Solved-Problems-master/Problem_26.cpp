#include<bits/stdc++.h>
using namespace std;

int main ()
{
   int a , b , temp;

   cin >> a >> b;

   while (b!=0)
   {
       temp = b;

       b = a%b;

       a = temp;
   }

   cout <<"LCM = " <<a <<endl;
}
