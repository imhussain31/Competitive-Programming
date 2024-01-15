#include<bits/stdc++.h>
using namespace std;

int main ()
{
    char s[100];

    int cnt=1;

    gets(s);

    for (int i = 0; i<strlen(s); i++)
    {
        if (isspace (s[i]))
        {
            cnt++;
        }
    }
    cout << cnt <<endl;






}
