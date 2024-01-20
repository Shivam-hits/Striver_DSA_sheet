//Given an integer N, write a program to count the number of digits in N.

// IN C LANGUAGE
#include<stdio.h>
int No_digits(int num){
    int t=num;
    int s=0;
    while(t>0){
        t=t/10;
        s++;
    }
    return s;
}
int main(){
    int num;
    printf("Enter the number");
    scanf("%d",&num);
    int c=No_digits(num);
    printf("Number of digits are %d ",c);
}