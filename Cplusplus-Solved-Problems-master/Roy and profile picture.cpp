#include<bits/stdc++.h>
using namespace std;

int main ()
{
    int l , n , w , h;

    cin >> l >> n;

    while(n--)
    {
        cin >> w >> h;

        if (w<l || h<l)
        {
           cout << "UPLOAD ANOTHER" <<endl;
        }
        else if(w==h)
        {
            cout << "ACCEPTED" <<endl;
        }
        else
        {
            cout << "CROP IT" <<endl;
        }
    }
}
