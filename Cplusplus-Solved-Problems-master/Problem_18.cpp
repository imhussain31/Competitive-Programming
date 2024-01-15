#include<bits/stdc++.h>
using namespace std;

int main ()
{
    char s[100];

    gets(s);

    for (int i = 0; i<strlen(s); i++)
    {
        if (s[i] == 'a' || s[i] == 'e' || s[i] == 'i' || s[i] == 'o' || s[i] == 'u')
        {
          cout <<  s[i];
        }

    }
    cout << endl;
    for (int i = 0; i<strlen(s); i++)
    {
        if (s[i] != 'a' && s[i] != 'e' && s[i] != 'i' && s[i] != 'o' && s[i] != 'u')
        {
           cout << s[i];
        }


    }





}
