#include<bits/stdc++.h>
using namespace std;


int main ()
{
    char s[100];

    int n;

    cin >> n;

    for (int i = 0; i<n; i++)
    {
        gets(s);

        strrev(s);

        cout << s <<endl;
    }

}
