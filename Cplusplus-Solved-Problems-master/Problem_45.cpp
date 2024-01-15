#include<bits/stdc++.h>
using namespace std;

int main ()
{
    int a , b , c ;

    float area, s;

    cin >> a >> b >> c;

    s =(a+b+c)/2;

    area = sqrt(s*(s-a)*(s-b)*(s-a));

    cout << area <<endl;


}
