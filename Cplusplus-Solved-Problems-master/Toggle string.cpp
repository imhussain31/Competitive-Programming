#include<bits/stdc++.h>
using namespace std;

int main ()
{
    char str[100] , c;

    cin >> str;

    for (int i = 0; i<strlen (str); i++)
    {
        if (str[i] >= 'a' && str[i] <= 'z')
        {
            c  = toupper(str[i]);
            cout << c;
        }
        else if (str[i] >= 'A' && str[i] <= 'Z')
        {
            c = tolower(str[i]);
            cout << c;
        }
    }


}
