#include<bits/stdc++.h>
using namespace std;

int main ()
{
    char ch;
    int n;

    cin >> n;

    while (n--)
    {
        cin >> ch;

        if (ch >= 'a' && ch <= 'z')
            cout << "Lowercase Letter" <<endl;
        else if (ch >= 'A' && ch <='Z' )
            cout << "Uppercase Letter" <<endl;
        else if (ch >= '0' && ch <= '9')
            cout << "Digit" <<endl;
        else
            cout << "Special Character" <<endl;

    }
}
