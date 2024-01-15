#include<bits/stdc++.h>
using namespace std;


int main ()
{
    vector <int> divisors [1000001];

    int i , j , n;

    cin >>n;

    for (i=1; i<=n; i++)
    {
        for (j=i; j<=n; j+=i)
            divisors[j].push_back(i);
    }




}
