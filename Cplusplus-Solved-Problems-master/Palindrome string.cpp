#include<bits/stdc++.h>
using namespace std;

int main ()
{
    int test;
	cin >> test;
	for (int i = 0; i < test; i++) {
		int seat, n = 0;
		cin>> seat;
		switch (seat % 12) {
			case 0: n = seat - 11;break;
			case 11: n = seat - 9;break;
			case 10: n = seat - 7;break;
			case 9: n = seat - 5;break;
			case 8: n = seat - 3;break;
			case 7: n = seat - 1;break;
			case 6: n = seat + 1;break;
			case 5: n = seat + 3;break;
			case 4: n = seat + 5;break;
			case 3: n = seat + 7;break;
			case 2: n = seat + 9;break;
			case 1: n = seat + 11;break;
		}
		cout << n;
		switch (n % 6) {
			case 0: cout <<" WS";break;
			case 1: cout <<" WS";break;
			case 2: cout <<" MS";break;
			case 5: cout <<" MS";break;
			case 3: cout <<" AS";break;
			case 4: cout <<" AS";break;
		}
		cout <<endl;
	}
}

