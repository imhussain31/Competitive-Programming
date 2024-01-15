#include<bits/stdc++.h>
using namespace std;

int main ()
{
    int  cnt = 0;

    char ch[] = "Hello World" , a;

    int l = strlen(ch);

    cin >> a;

    for (int i = 1; i<=l; i++)
    {
        if (ch[i] == a )
        {
            cnt++;
        }
    }

    cout << cnt <<endl;




}
