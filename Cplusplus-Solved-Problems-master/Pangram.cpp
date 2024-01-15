#include<bits/stdc++.h>
using namespace std;

int main ()
{
    int n;

    cin >> n;

    string s;

    for (int i = 0; i<n; i++)
    {
        cin >>s;

        if (s[0] >= 'A' && s[0] <= 'Z')
            cout << "YES" <<endl;
        else
            cout << "NO" <<endl;
    }




}
