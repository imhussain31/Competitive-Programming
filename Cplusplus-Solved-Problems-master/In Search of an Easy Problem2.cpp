#include <bits/stdc++.h>
using namespace std;

int main ()
{
    int a , n ,sum =0;

    cin >>n;

    for (int i = 0; i<n; i++)
    {
        cin >>a;

        sum +=a;
    }

    if (sum >= 1)
        cout << "HARD" <<endl;
    else
        cout << "EASY" <<endl;




}
