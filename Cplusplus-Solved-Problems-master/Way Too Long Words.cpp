#include<iostream>
#include<string.h>
using namespace std;

int main()
{

    char s[1001];
    int i,len,p,n,j;
    cin >> n;
    for(i=1; i<=n; i++)
    {
        cin >> s;
        len=strlen(s);

        if(len>10)
            cout << s[0] <<len-2 <<s[len-1] <<endl;
        else
            cout << s <<endl;
    }
}
