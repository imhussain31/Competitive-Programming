#include<bits/stdc++.h>
using namespace std;

int main ()
{
    char s[10];

    int cnt = 0;

    cin >> s;

    for (int i = strlen(s); i>=0; i++)
    {
        if (s[i] != s[i - 1])
        {
            cnt = 0;
        }

        for (char j = 'a'; j<='z'; j++)
        {
            if (s[i] == j)
            {
                cnt++;
            }
        }
        cout << s[i] << "=" <<cnt <<endl;
    }
}
