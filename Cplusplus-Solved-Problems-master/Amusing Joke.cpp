#include<bits/stdc++.h>
using namespace std;

int main ()
{
    string s , s1 ,s2 , s3;

    cin >> s >> s1 >> s2;

    s3+=s+s1;

    sort (s3.begin() , s3.end());
    sort (s2.begin() , s2.end());


    if ( s3== s2){
        cout << "YES" <<endl;
    }
    else
        cout << "NO" <<endl;





}
