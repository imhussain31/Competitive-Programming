///Linear search
#include <iostream>
using namespace std;


int main ()
{
    int A[100], n, i, X = 20 ,counts = 0 ;

    cout << "How many numbers you want to put in the array : ";

    cin >> n;

    for (i=0; i<n; i++)
    {
        cin >> A[i];
    }
    for (i=0; i<n; i++)
    {
        if (A[i] == X)
        cout << "Found in position :" <<i <<endl;
            counts++;
    }

    if (counts == 0)
    cout << "Not found";

}
