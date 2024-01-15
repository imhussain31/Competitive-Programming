#include<iostream>
using namespace std;

int main ()
{
    int A , B , C , i, cases=0 , Budget;

    cin >> Budget ;
    cin >> A >>B >>C;

    if (4<=Budget>=100)
    {
        for (i=1; i<=3; i++){
            if (A+B+C<=100)
                cases++;
        }cout <<cases;
        for (i=1; i<=2; i++){
            if (A+B<=100)
                cases++;
        }cout <<cases;
        for (i=1; i<=2; i++){
            if (B+C<=100)
                cases++;
        }cout <<cases;
        for (i=1; i<=2; i++){
            if (A+C<=100)
                cases++;
        }cout <<cases;
    }


}
