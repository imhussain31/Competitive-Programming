#include<bits/stdc++.h>
using namespace std;
int first(int x) {
  while(x >= 10)
  	{
  		x = x / 10;
	}
}
int main ()
{
    int n , cnt = 0;
    int store;

    cin >> n;

    int a[n];

    for (int i = 0; i<n; i++)
    {
        cin >> a[i];
    }
    for (int i = 0; i<n/2; i++)
    {

	 store+=first(a[i]);
    }
    for (int i = n/2; i<n; i++)
    {
         int len = ceil(log10(a[i]))+1;
         int last=a[i] % 10;
         store+=last;
    }
    cout << store;
}
