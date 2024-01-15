#include<bits/stdc++.h>
#include<math.h>
using namespace std;

int main ()
{
    int i , j , A[5][5] , x , y , ans;

    for (i=0; i<=4; i++)
    {
        for(j=0; j<=4; j++)
        {
            cin >> A[i][j];
        }
    }
    for (i=0; i<=4; i++)
    {
        for(j=0; j<=4; j++)
        {
            if (A[i][j] == 1){
                x = i;
                y = j;
            }
        }
    }

    ans = abs(x - 2)+ abs(y - 2);
    cout << ans  <<endl;

}
