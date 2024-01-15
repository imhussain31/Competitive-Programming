#include<bits/stdc++.h>
using namespace std;

int main ()
{
    string s;

    int sum = 0 , a;

    cin >> s;

    for (int i = 0; i<s.length(); i++)
    {
        if (s[i]<='97' && s[i] <='122')
        {
            a = s[i]-96;
        }
        sum+=a;
    }
    cout << sum <<endl;


}
