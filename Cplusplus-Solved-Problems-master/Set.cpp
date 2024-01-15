#include<bits/stdc++.h>
using namespace std;

int main ()
{
     set <char>  s;

     set <char>   :: iterator itr;

    for (int i = 1; i<=5; i++)
    {
        cin >> i;
        s.insert (i);
    }


    for (itr = s.begin(); itr != s.end(); itr++)
    {
        cout << *itr <<endl;
    }





}
