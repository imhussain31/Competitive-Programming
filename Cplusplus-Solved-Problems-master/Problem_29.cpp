#include<bits/stdc++.h>
using namespace std;

int main ()
{
    int a[100], n , cnt = 1;

    cin >> n;

    for (int i = 1; i<n; i++ )
    {
        cin >> a[i];

         if (a[i] < a[i-1])
         {
             cnt = 0;
             break;
         }


    }

    if (cnt == 0) cout << "Yes" <<endl;
    else cout << "No" <<endl;







}
