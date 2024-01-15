#include<bits/stdc++.h>
using namespace std;

int main ()
{

    int n ,cnt1 = 0, cnt2 = 0 ;

    cin >> n;

    char s[n];

    cin >> s;

    for (int i = 0; i<n; i++)
    {

        if (s[i] == 'A')
            cnt1++;
        else if (s[i] == 'D')
            cnt2++;

    }

    if (cnt1 > cnt2)
        cout << "Anton" <<endl;
    else if (cnt2 > cnt1)
        cout<< "Danik" <<endl;
    else if (cnt1 == cnt2)
        cout << "Friendship" <<endl;

}
