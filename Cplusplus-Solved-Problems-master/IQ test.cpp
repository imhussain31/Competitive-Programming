#include<bits/stdc++.h>
using namespace std;


int main ()
{
    int n , a , cnt = 0 , cnt1 = 0 , k , k1;

    cin >> n;

    for (int i = 1; i<=n; i++)
    {
        cin >> a;

        if (a%2 == 0){
            cnt++;
            k = i;
        }
        else
        {
            cnt1++;
            k1 = i;
        }
    }

    if (cnt > cnt1)
    {
        cout << k1 <<endl;
    }
    else{
        cout << k <<endl;
    }

}
