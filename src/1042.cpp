#include<iostream>
#include <set>
using namespace std;


int main ()
{
    set < int > st;
    set < int > :: iterator itr;

    for (int i=0; i<3; i++)
    {
        cin >> (i);
    }
    st.insert (i);

    for (itr = st.begin(); itr != st.end(); itr++)
    {
        cout << *itr <<endl;
    }
}
