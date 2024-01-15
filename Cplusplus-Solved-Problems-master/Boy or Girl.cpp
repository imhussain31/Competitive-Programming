#include<bits/stdc++.h>
using namespace std;
int main()
{
    int l,cnt=1,i;

    string s;

    cin>>s;

    l=s.length();

    sort(s.begin(),s.end());

    for (i = 1; i<l; i++)
    {
        if (s[i] != s[i -1] )

        {
            cnt++;
        }

    }
    if(cnt%2==0)

    {
        printf("CHAT WITH HER!\n");
    }

    else

    {
        printf("IGNORE HIM!\n");
    }

    return 0;

}
