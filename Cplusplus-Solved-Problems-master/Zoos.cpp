#include<bits/stdc++.h>
using namespace std;

int main ()
{
    char s[20];

    int x = 0, y = 0;

    cin >> s;

    for (size_t i = 0; i<strlen(s); i++)
    {
        if (s[i] == 'z' )
          x++;
        else
            y++;

    }

    if (x*2 == y)
    {
        cout << "Yes" <<endl;
    }



}
