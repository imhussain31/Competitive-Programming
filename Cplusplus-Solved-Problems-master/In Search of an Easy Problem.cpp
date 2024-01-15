#include<bits/stdc++.h>
using namespace std;

int main ()
{
    int a[100] , n , c = 0 , c1  = 0;

    cin >> n;

    for (int i = 0; i<n; i++)
    {
       cin >> a[i];

       if (a[i] == 1){
           c++;
       }
       else if (a[i] == 0)
       {
           c1++;
       }
    }

     if (c >= 1)
        cout << "HARD" <<endl;
     else
        cout << "EASY" <<endl;

}
