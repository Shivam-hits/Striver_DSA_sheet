// Q) Given an integer N, write a program to count the number of digits in N.

// java


// #include<iostream>
// using namespace std;

// int No_digits(int num){
//     int t=num;
//     int s=0;
//     while (t>0){
//         t=t/10;
//         s=s+1;
//     }
//     return s;
// }

import java.util.*;

public class count_digits{
    public static void main(String[] args){
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        num=sc.nextInt();
        int c= No_digits(num);
        System.out.println("Number of digits are " + c);
    }

    public static int No_digits(int num){
        int t=num;
        int s=0;
        while (t>0){
            t=t/10;
            s=s+1;
        }
        return s;
    }
}