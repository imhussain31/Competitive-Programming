#include<bits/stdc++.h>
using namespace std;

int main ()
{
    string str;

    int i ,t = 0;

    cin >>str;

    for (i=0; i<str.length(); i++){
        if (str[0]>=97 && str[0]<=122)
        {
            str[0] = toupper(str[0]);
            cout << str <<endl;
            t++;
        }
    }
    if (t == 0)
    {
        cout << str <<endl;
    }
}
