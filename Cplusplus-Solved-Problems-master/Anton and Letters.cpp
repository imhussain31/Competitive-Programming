#include<bits/stdc++.h>
using namespace std;

int main ()
{
    char  s[1000];

    int l, cnt = 0;

    gets(s);

    l = strlen(s);

    sort (s, s+l);

    for (int i = 0; i<l-1; i++)
    {

        if (s[i] >= 97 && s[i] <= 122)
        {
            cnt++;
            if (s[i] == s[i+1]){
                cnt--;
            }
        }


    }

    cout << cnt <<endl;


}
