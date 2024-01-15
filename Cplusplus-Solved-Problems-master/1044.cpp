#include <iostream>
using namespace std;


int main ()
{
    int start , last;

    cin >> start >> last;

   if (start == last)
       cout << "O JOGO DUROU "  <<24 - start +last  <<" HORA(S)" <<endl;
   else if (start <= last)
       cout << "O JOGO DUROU "  <<last - start <<" HORA(S)" <<endl;
   else
     cout << "O JOGO DUROU "  <<24 - start +last  <<" HORA(S)" <<endl;

   return 0;
}
