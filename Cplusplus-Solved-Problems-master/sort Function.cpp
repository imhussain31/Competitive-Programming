#include<bits/stdc++.h>
using namespace std;


int main ()
{
    string s;

    cin >> s;

    sort (s.begin(), s.end());

    cout << s <<endl;

    int arr[] = { 1, 2, 3, 4, 7, 98, 0, 12, 35, 99, 14 };

    cout << sizeof(arr) / sizeof (arr[0]) <<endl;

}
