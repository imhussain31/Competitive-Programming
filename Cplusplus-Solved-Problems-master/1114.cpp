#include<iostream>
#include<stdbool.h>
using namespace std;

int main ()
{
    int a , b = 2002 ;

    while(true)
    {
       cin >>a;

        if (a == b)
        {
            cout <<"Acesso Permitido" <<endl;
            break;
        }

        if (a != b)
            cout<< "Senha Invalida" <<endl;;

    }

}


