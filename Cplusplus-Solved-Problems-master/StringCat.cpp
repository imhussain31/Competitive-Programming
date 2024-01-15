#include<iostream>
#include<string.h>
using namespace std;

int main ()
{
     /*char str1[] = "My name is ";
    char str2[] = "Muhammad Hussain";

    strcat (str1 , str2);

    cout << str1;

    return 0;*/

    char str1 [30] = "My name is";
    char str2 [] ="Muhammad Hussain";

    int i = 0 , j=0, len=0;

    while (str1[i]!='\0')
    {
        i++;
        len++;
    }
    while (str2[j] != '\0')
    {
        str1[len+j] = str2[j];
        j++;
    }
    cout <<str1;


}
