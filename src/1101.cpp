#include<iostream>
using namespace std;

int main ()
{
  int i , temp ,a , b ,sum;

  while (true)
  {
  cin >> a;
  cin >> b;

  if (a <=0) break;
  if (b <=0) break;

  if (a > b)
  {
      a = a + b;
      b = a - b;
      a = a - b;
  }
  sum = 0;
  for (i=a; i<=b; i++)
  {
      cout <<i  << " ";
      sum += i;
  }
  cout << "Sum=" <<sum <<endl;
  }
}

