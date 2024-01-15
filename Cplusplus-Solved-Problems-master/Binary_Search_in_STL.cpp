///Binary search
#include<iostream>
using namespace std;

int main ()
{
    int A[10] = {10, 12, 14, 15, 20, 24,25,30, 34, 49};

    int i, mid, start, key, last;

    start = 0;

    last = 9;

    key = 15;

    do
    {
        mid = (int) ((start + last)/2);

        if (A[mid]== key)
        {
            cout << "Found at the position of : " <<mid+1;
            break;
        }
        else if (A[mid] > key)
            last = mid - 1;
        else
            start = mid + 1;
    }

    while (start <= last);

    if (start > last)
    {
        cout << "Not found" <<endl;
    }

    return 0;
}
