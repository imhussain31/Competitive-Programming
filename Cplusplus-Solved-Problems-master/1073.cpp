#include<iostream>
using namespace std;

int main ()
{
    int A[1000] , i , n , in = 0 , out = 0;

    cin >> n;

    for (i=0; i<n; i++)
    {
        cin >> A[i];
    }
    for (i=0; i<n; i++)
    {
        if (A[i] >= 10 &&  A[i] <=20)in++;
        else out++;
    }

    cout << in <<" in" <<endl;
    cout << out <<" out" <<endl;



}
