#include<bits/stdc++.h>

using namespace std;

int main ()
{
    /*pair <int , int > Mypair;

    Mypair.first = 100;
    Mypair.second  = 200;

    cout << Mypair.first <<endl;
    cout <<Mypair.second <<endl;*/

    ///We can also initialize a pair.

    /*pair <int , int > Mypair (100, 200);

    cout << Mypair.first <<endl;
    cout <<Mypair.second <<endl;*/

    /// If not initialized, the first value of the pair gets automatically initialized.


    /*pair < string , double > Mypair;

    Mypair = make_pair ("CodeJam is the best Google contest ." , 5.66);

    cout << Mypair.first << " " <<Mypair.second <<endl;*/

    /*pair <int ,int > Mypair1 = make_pair (199, 100);
    pair <int ,int > Mypair2 = make_pair (199, 101);

    cout << (Mypair1 == Mypair2) <<endl;
    cout << (Mypair1 != Mypair2) <<endl;
    cout << (Mypair1 >= Mypair2) <<endl;
    cout << (Mypair1 <= Mypair2) <<endl;
    cout << (Mypair1 > Mypair2) <<endl;
    cout << (Mypair1 < Mypair2) <<endl;*/

    pair<char, int>pair1 = make_pair('A', 1);
    pair<char, int>pair2 = make_pair('B', 2);

    cout << "Before swapping:\n " ;
    cout << "Contents of pair1 = " << pair1.first << " " << pair1.second ;
    cout << "Contents of pair2 = " << pair2.first << " " << pair2.second ;
    pair1.swap(pair2);

    cout << "\nAfter swapping:\n ";
    cout << "Contents of pair1 = " << pair1.first << " " << pair1.second ;
    cout << "Contents of pair2 = " << pair2.first << " " << pair2.second ;









}
