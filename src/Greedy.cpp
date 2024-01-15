#include<bits/stdc++.h>
using namespace std;
const int MAX=100;
int A[MAX];

int main ()
{
    int t, n, numberOfthings  = 0, currentTime = 0;

    cin >> n >> t;

    for (int i=0; i<n; i++)
    {
        cin >> A[i];
    }

    sort (A, A+n);

    for (int i = 0; i<n; i++)
    {

        currentTime+=i;

        if (currentTime > t)
            break;

        numberOfthings++;


    }

    cout << numberOfthings <<endl;




}
