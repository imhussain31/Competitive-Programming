#include<bits/stdc++.h>
using namespace std;

int main ()
{
    int n , x;

    cin >> n;

    vector <int> v[4];

    for (int i = 1; i<=n; i++)
    {
        cin >> x;
        v[x].push_back(i+1);
    }

    int t  = min(v[1].size(), min (v[2].size() ,v[3].size()));

    cout << t <<endl;

    for (int i  = 0; i<t; i++)
    {
        cout << v[1][i] << " " << v[2][i] << " " << v[3][i] <<endl;
    }
}
