#include<bits/stdc++.h>
using namespace std;

int main ()
{

    int i , j ,n , m , a;

    cin >> n;

    for (i = 1; i<=n; i++)
    {

      int sum = 0 ;
      cin >> m;

      for (j = 1; j<=m; j++)
      {
          cin >> a;
          if (a >= 0)
            sum += a;
      }
      cout  << "Case " << i << ": " << sum <<endl;
    }

}
