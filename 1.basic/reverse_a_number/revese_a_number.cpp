// Given a number N reverse the number and print it.

// c++ Language

#include<iostream>
using namespace std;

int reverse(int nums){
    int t=nums;
    int rev=0;
    while(t>0){
        int d=t%10;
        rev=rev*10+d;
        t=t/10;
    }
    return rev;
}
int main(){
    int num;
    cout<<"Enter the number "<<endl;
    cin>>num;
    cout<<"The reverse is "<<reverse(num);
}