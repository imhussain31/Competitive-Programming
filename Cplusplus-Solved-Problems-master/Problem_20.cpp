#include<bits/stdc++.h>
using namespace std;

int main ()
{
    char s[100];

    int cnt = 0;

    gets (s);

    char* token = strtok( s , "!,;.? ");

    while (token != '\0')
    {
        if (token > 0)
        {
            cnt++;
        }
        token = strtok (NULL, "!,;.?");
    }

    cout << cnt <<endl;






}
