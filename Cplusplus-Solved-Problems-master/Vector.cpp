#include<bits/stdc++.h>
using namespace std;

int main ()
{
    vector <int> v;

    vector <int> :: iterator itr;

    for (int i = 1; i<=10; i++)
    {
        v.push_back (i);
    }

    for (itr = v.begin (); itr!=v.end(); itr++)
    {
        cout << *itr << " ";
    }
}
