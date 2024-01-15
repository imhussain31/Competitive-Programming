#include<iostream>
using namespace std;

int main ()
{
    int A[100], n, i, mini, temp;

    scanf ("%d", &n);

    for (i=0; i<n; 0 i++)
    {
        mini = i;

        for (j=i+1; j<n; j++)
        {
            scanf ("%d",A[j]);
            if (A[j] <  A[mini])
                mini = j;
        }
    }
    A[0] = A[0] + mini;

    mini = A[0] - mini;

    A[0] = A[0] - mini;

}
}
