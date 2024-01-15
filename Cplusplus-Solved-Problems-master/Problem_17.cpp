#include<bits/stdc++.h>
using namespace std;


int main ()
{
    int n, cnt = 0;

    char s[100];

    gets (s);

    for (int j = 0; j<strlen(s); j++)
    {

        if (s[j] == 'a' || s[j] == 'e' || s[j] == 'i' || s[j] == 'o' || s[j] == 'u')
        {
            cnt++;
        }

    }
    cout << "Number of vowel : " << cnt <<endl;







}
