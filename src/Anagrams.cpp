#include<bits/stdc++.h>
using namespace std;

int main ()
{
    int n, cnt = 1;
    string s1, s2;

    cin >> n;

    for (int i = 1; i<=n; i++)
    {
        cin >> s1 >> s2;

        int l1 = s1.length();
        int l2 = s2.length();

        sort(s1.begin(), s1.end());
        sort(s2.begin(), s2.end());


        for (int j =0; j<max (l1 , l2); j++)
        {
           if (s1[i]!=s2[i])
           {
               s1.erase();
               cnt++;
           }
        }
        //abex
        //xcad
    }
    cout << cnt <<endl;
}
