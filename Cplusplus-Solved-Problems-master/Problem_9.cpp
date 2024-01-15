#include<bits/stdc++.h>
using namespace std;

int main ()
{
    /*int a, n;

    cin >> n;

    for (int i = 0; i<n; i++)
    {
    cin >> a;

    double s = sqrt(a);

    if (ceil(s) == floor(s))
        cout << "YES" <<endl;
    else
        cout << "NO"<<endl;
    }*/

    int n , a ,s;

    cin >> n;

    for (int i = 0; i<n; i++)
    {
        cin >> a;

        s = sqrt (a);

        if (s * s ==  a)
            cout << "YES" <<endl;
        else
            cout << "NO" <<endl;
    }

}
