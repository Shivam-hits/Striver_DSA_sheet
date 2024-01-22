//Q to find greatest common divisor

#include<stdio.h>

int  GCD(int num1,int num2)
{
    int gcd=0;int n=(num1>num2)?num2:num1;
    for(int i=1;i<=n;i++)
    {
        if(num1%i==0 && num2%i==0)
            gcd=i;
    }
    return gcd;
}
int main(){
    int num1,num2;
    printf("Enter the numbers ");
    scanf("%d %d",&num1,&num2);
    printf("The gcd of these numbers is %d" ,GCD(num1,num2));
}