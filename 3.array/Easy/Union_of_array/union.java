// union of 2 array
import java.util.*;

class union{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int max=n+m;
        int min=(n<m) ? n : m;
        int arr1[]=new int[n];
        int arr2[]=new int[m];
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int ma[] = new int[max];
        int j=0,c=0;
        for(int i=0;i!=n;){
            if(arr1[i]==arr2[j]){
                ma[c]=arr1[1];
                c++;
                i++;
                j++;
            }
            if(arr1[i]>arr2[j]){
                ma[c]=arr2[2];
                j++;
                c++;
            }
            if(arr1[i]<arr2[j]){
                ma[c]=arr1[i];
                c++;
                i++;
            }
            if((j==m && i!=n)){
                for(int k=i;k<n;k++){
                    ma[c]=arr1[k];
                    c++;
                }
                break;
            }
            if((j != m && i==n)){
                for(int k=j;k<m;k++){
                    ma[c]=arr2[k];
                    c++;
                }
                break;
            }

        }
        for(int i=0;i<max;i++){
            System.out.print(ma[i]+"  ");
        }
    }
}