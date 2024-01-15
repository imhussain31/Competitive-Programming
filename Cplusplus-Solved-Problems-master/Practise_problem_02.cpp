#include<bits/stdc++.h>
using namespace std;


int main ()
{
    int n, f = 1;

    cin >> n;

   while (n > 1)
   {
       f*=n;
       n--;
   }
   cout << f <<endl;
}
