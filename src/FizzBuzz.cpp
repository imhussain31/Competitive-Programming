#include<bits/stdc++.h>
using namespace std;

int main ()
{
    int a , n;

    cin >> a >> n;

    for (int i = a; i<=n; i++)
    {
        if (i%3 && i%5)
            cout << "FizzBuzz" <<endl;
        else if (i%3)
            cout <<"Fizz" <<endl;
        else if (i%5)
            cout << "Buzz" <<endl;
            else
                cout << i << endl;

    }




}
