#include<bits/stdc++.h>
using namespace std;

int main ()
{
    int n, sum = 0, m;

    string s;

    cin >> n;

    for (int i = 1; i<=n; i++)
    {
        cin >> s;

        if (s == "Tetrahedron")
            m = 4;
        if (s == "Cube" )
            m = 6;
        if ( s == "Octahedron")
            m = 8;
        if ( s == "Dodecahedron")
            m = 12;
        if ( s == "Icosahedron"){
             m = 20;
        }
       sum+=m;
    }
    cout << sum <<endl;

}
