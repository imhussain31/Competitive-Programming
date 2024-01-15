#include<bits/stdc++.h>
using namespace std;


int main ()
{
    int i , cnt = 0;
    char s[20];

    cin >> s;

    for (i=0; i<strlen(s);  i++)
    {
        if (s[i] == '7' || s[i] == '4')
        {
            cnt++;
        }
    }

    if (cnt == 7 || cnt == 4)
        cout << "YES " <<endl;
    else
        cout << "NO" <<endl;


}
