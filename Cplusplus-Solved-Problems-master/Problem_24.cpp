#include<bits/stdc++.h>
using namespace std;


int main ()
{
    char s[100];

    cin >> s;

    for (int i = 0; i<strlen(s); i++)
    {
        if (s[i] >= 'A' && s[i] <= 'Z' )
        {
            cout << s[i] - 64;
        }
    }





}
