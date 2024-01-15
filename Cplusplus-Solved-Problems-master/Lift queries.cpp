#include<bits/stdc++.h>
using namespace std;
int main()
{
	int r,Glift=0,Tlift=7;
	cin>>r;
	while(r--)
	{
		int n;
		cin>>n;
		if((n-Glift)<=(Tlift-n))
		{
			Glift=n;
			cout<<"A"<<endl;
		}
		else
		{
			Tlift=n;
			cout<<"B"<<endl;
		}
	}
	return 0;
}
