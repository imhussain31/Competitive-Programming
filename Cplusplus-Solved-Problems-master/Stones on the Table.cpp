#include<bits/stdc++.h>
using namespace std;

int main ()
{
   int i , cnt = 0 , n;

   char ch [50];

   cin >> n;

   cin >>ch;

   for (i=0; i<n; i++)
   {
       if (ch[i] == ch[i+1])
       {
           cnt ++;
       }
   }
   cout << cnt <<endl;
}
