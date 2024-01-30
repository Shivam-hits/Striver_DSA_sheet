import java.util.*;

public class merg{
    public static void main(Static[] args){
        int n;
        Scanner sc =new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[];
        for(int i=0;i<n;i++){
            System.out.println("Enter ")
            arr[i]=sc.nextInt();
        }
        Merge_sort(arr,0,n);
    }
    void Merge_sort(int arr[],int l,int h){
        int mid=n/2;
        Merge_sort(arr,0,mid);
        Merge_sort(arr,mid+1,n);
        Merge(arr,l,h);
    }
    void Merge(){

    }
}