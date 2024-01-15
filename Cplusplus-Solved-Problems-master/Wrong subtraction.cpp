#include<bits/stdc++.h>
using namespace std;

int main (){
    int n , k , last;

    cin >> n >> k;

    while (k--)
    {
        last = n%10;

        if (last != 0)
        {
            n-=1;
        }
        else if (last == 0)
        {
            n/=10;
        }

    }
    cout << n <<endl;

}
