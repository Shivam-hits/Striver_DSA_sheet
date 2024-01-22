# Given a number N reverse the number and print it.

# Python Language
#include<stdio.h>

def reverse(nums):
    t=nums
    rev=0
    while(t>0):
        d=t%10
        rev=rev*10+d
        t=t//10
    return rev

def main():
    print("Enter the number ")
    num=int(input("Enter the number "))
    print("The reverse is " )
    print(reverse(num));

main();