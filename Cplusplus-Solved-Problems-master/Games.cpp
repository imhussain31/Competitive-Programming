#include<bits/stdc++.h>
using namespace std;


int main ()
{
    int n ,cnt = 0;

    cin >> n;


    int a[n] , b[n];

    for (int i =0; i<n; i++)
    {
        cin >> a[i] >> b[i];
        for (int j = 0; j<i; j++){
            if (a[i] == b[j] )cnt++;
            if (b[i] == a[j] )cnt++;
        }
    }



    cout <<cnt <<endl;






}
