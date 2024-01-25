// Write program for bubble sort
import java.util.*;
public class bubble_sort{
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter " + i + " elements");
            arr[i]=sc.nextInt();
        }
        int temp=0;
        for (int i = n - 1; i >= 0; i--) {
        for (int j = 0; j <= i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                temp = arr[j + 1];
                arr[j + 1] = arr[j];
                arr[j] = temp;
            }
        }
    }
        System.out.println("Sorted array");
        for(int i=0;i<n;i++){
            System.out.println("Elements are :"+ arr[i]);
        }
    }
}