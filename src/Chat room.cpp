#include<bits/stdc++.h>
using namespace std;;

int main ()
{
    int i , cnt = 0 ,j = 0;

    string arr, brr ="hello";

    cin >> arr;

    for (i=0; i<arr.size(); i++)
    {
        if (arr[i] == brr[j])
        {
            cnt++;
            j++;
        }
    }

    if (cnt == 5)
        cout << "YES" <<endl;
    else
        cout << "NO" <<endl;







}
