#include<bits/stdc++.h>
using namespace std;


int main ()
{
    int m , n , cnt = 0;

    cin >> m >> n;

    for (int i = m; i<n; i++)
    {
        if (i%3 != 0)
        {
            cnt++;
        }
    }

    cout << cnt <<endl;






}
