// Q) Given an integer N, write a program to count the number of digits in N.

// C++


#include<iostream>
using namespace std;

int No_digits(int num){
    int t=num;
    int s=0;
    while (t>0){
        t=t/10;
        s=s+1;
    }
    return s;
}

int main(){
    int num;
    cout<<"Enter the number"<<endl;
    cin>>num;
    int c= No_digits(num);
    cout<<"Number of digits are "<< c <<endl;
}