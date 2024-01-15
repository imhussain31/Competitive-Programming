#include<bits/stdc++.h>
using namespace std;

int main ()
{
    int n, a, l,r, sum = 0;

    cin >> n >> a;

    int arr[n];

    for (int i = 0; i<n; i++)
    {
        cin >> arr[i];
    }
    while (a--)
    {
        cin >> l >> r;

        cout << (l+r)/2 <<endl;
    }






}
