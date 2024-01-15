#include <bits/stdc++.h>
using namespace std;

int main ()
{
    long long int n, cnt = 0;

    cin >> n;

    while (n != 0)
  {
    if (n >= 100)
    {
        n-=100;
        cnt++;
    }
    else if (n >= 20)
    {
        n-=20;
        cnt++;
    }
    else if (n >= 5)
    {
        n-=5;
        cnt++;
    }
    else if (n >= 1){
        n-=1;
        cnt++;
    }
  }
    cout << cnt <<endl;
}








