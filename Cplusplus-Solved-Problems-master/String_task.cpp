#include<bits/stdc++.h>
using namespace std;

int main ()
{
    int i;

    char str[100];

    cin >>str;

    for (i=0; i< strlen(str); i++){
    if (str[i]>=65 && str[i]<=90)
    {

        str[i] = 97 + str[i] - 65;

    }

    if (str[i] != 'a' && str[i] != 'e' && str[i] != 'i' &&str[i] != 'o' &&str[i] != 'u' &&str[i]!='y' )
    {
        cout << "." <<str[i];
    }
    }

}
