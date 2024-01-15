#include<bits/stdc++.h>
using namespace std;

int main ()
{
    list <int> list1;

    list <int> :: iterator itr;

    list1.push_back (12);
    list1.push_back (10);
    list1.push_back (22);
    list1.push_back (15);
    list1.push_back (11);
    list1.push_back (12);

    list1.pop_front();


    for (itr = list1.begin(); itr != list1.end(); itr++)
    {
        cout << *itr <<endl;
    }

    cout <<"Front number of the list : " <<list1.front () <<endl;

    cout << "Maximum size of the list :" <<list1.max_size() <<endl;

}
