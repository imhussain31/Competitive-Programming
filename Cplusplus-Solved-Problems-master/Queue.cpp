#include<bits/stdc++.h>
using namespace std;

/// traverse a queue
void display (queue <string> qt)
{
    while (!qt.empty())
    {
        cout << qt.front() <<endl;
        qt.pop();
    }
}

int main ()
{
  queue <string> q;

  q.push ("Muhammad");
  q.push ("Hussain");
  q.push ("khan");

  q.pop();
  cout << q.size() << endl;
  cout << q.front() <<endl;
  cout << q.back() <<endl;

  display (q);
}
