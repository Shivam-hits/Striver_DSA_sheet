// Given a number N reverse the number and print it.

// java Language
import java.util.*;
public class reverse_a_number{
    public static int reverse(int nums)
    {
        int t=nums;
        int rev=0;
        while(t>0){
            int d=t%10;
            rev=rev*10+d;
            t=t/10;
        }
        return rev;
    }
    public static void main(String[] args)
    {
        int num;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number ");
        num=sc.nextInt();
        System.out.println("The reverse is " + reverse(num));
    }
}