#include<bits/stdc++.h>
using namespace std;

int main ()
{

    string s ;

    int cnt1 = 0,cnt2 = 0;

    cin >> s;

    for (size_t i=0 ; i < s.size(); i++)
    {
        if (s[i] >= 'a' && s[i] <= 'z')
            cnt1++;
        else if (s[i] >= 'A' && s[i] <= 'Z')
            cnt2++;

    }

    for (size_t i=0; i<s.size(); i++)
    {
       if (cnt2 > cnt1)
        {
            s[i]  = toupper(s[i]);
        }
        else
        {
            s[i] = tolower(s[i]);
        }

    }


    cout << s <<endl;



}
