#include<bits/stdc++.h>
using namespace std;

int main ()
{
    char s1[20] , s2[20] ;

    int flag = 0, i , j , len;

    cin >> s1;

    len = strlen(s1)-1;

    for (i = len , j = 0;  i>=0; i-- , j++)

        s2[j] = s1[i];

    if (strcmp (s1 , s2))
        flag  = 1;

    if (flag == 1)
        cout << "No" <<endl;
    else
        cout << "Yes" <<endl;






}
