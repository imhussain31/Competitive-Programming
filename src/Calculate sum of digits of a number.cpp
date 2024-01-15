#include<iostream>
using namespace std;

int main ()
{
   int num , i  , sum = 0 , lastdigit;

   cin >> num ;

   while (num!=0)
   {
      lastdigit = num%10;

      sum = sum + lastdigit;

      num /= 10;
   }
   cout << sum;

}
