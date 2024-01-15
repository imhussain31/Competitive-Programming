#include<bits/stdc++.h>
using namespace std;


int main ()
{
    char ch;

    int num1 , num2;

    cin >> num1  >> num2;

    cin >> ch;

    switch (ch)
    {
    case '+':
        {
            cout << num1 + num2 <<endl;
            break;
        }
    case '-':
        {
            cout << num1 - num2 <<endl;
            break;
        }
    case '*':
        {
            cout << num1 * num2 <<endl;
            break;
        }
    case '/':
        {
            cout << num1 / num2 <<endl;
            break;
        }
    default :
        {
            cout << "invalid character";
        }


    }





}
