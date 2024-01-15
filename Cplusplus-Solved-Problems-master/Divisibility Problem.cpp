#include<bits/stdc++.h>
using namespace std;

int main ()
{
    int n, a, b;

    cin >> n;

    for (int i = 1; i<=n; i++)
    {
        cin >>a >> b;

        int cnt = 0;

        while (a)
        {

            if (a%b == 0)
            {
                cout << cnt <<endl;
                break;
            }
            else
            {
                cnt++;
            }
            a+=1;
        }


    }




}
