import java.util.*;

public class insertion{
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
        int j=0;
        for(int i=1;i<n;i++)
        {
            temp=arr[i];
            j=i-1;
            // while(j>=0 && arr[j]>temp){
            //     arr[j+1] = arr[j]; 
            //     j--;
            // }
            // arr[j+1]=temp;

            for(j=i-1;j>=0 && arr[j]>temp;j--)
            {
                    arr[j+1] = arr[j]; 
            }
            arr[j+1]=temp;
        }
        System.out.println("Sorted array");
        for(int i=0;i<n;i++){
            System.out.println("Elements are :"+ arr[i]);
        }
    }
}