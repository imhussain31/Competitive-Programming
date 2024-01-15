#include<bits/stdc++.h>
using namespace std;

int main ()
{
    int n, m , flag = 0;

    char s[100];

    cin >> n;

    for (int i = 1; i<=n; i++)
    {
        flag = 0;

        cin >> m;

        for (int j = 0; j<m; j++ )
        {

            cin >> s[i];

            if (s[i]!='a'&& s[i]!='e' && s[i]!='i' && s[i]!='o' &&s[i]!='u')
            {
                flag++;
            }
        }
        cout <<flag <<endl;
    }
}
