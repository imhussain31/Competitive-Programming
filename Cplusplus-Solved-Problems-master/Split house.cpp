#include<bits/stdc++.h>
using namespace std;

int main ()
{
    int n;

    cin >> n;
        string s;
        cin >> s;
        int res = 1;
        string s1;
        if(n==1){
                if(s[0]=='.'){
                    cout << "YES" <<endl;
                    cout << "B" <<endl;
                }else{
                    cout << "YES" <<endl;
                    cout << "H" <<endl;
                }
        }else{
        for (int i = 0; i<s.size(); i++)
        {
            if (s[i]== 'H' && s[i+1] == 'H')
                {
                    res = 0;
                }

        }
        if(res==0){
            cout << "NO" <<endl;
        }else{
            for (int i = 0; i<s.size(); i++)
        {
            if (s[i]== '.')
                {
                    s1+='B';
                }else{
                    s1+='H';
                }

        }
        cout << "YES" <<endl;
        cout << s1 <<endl;
        }
        }

    }
