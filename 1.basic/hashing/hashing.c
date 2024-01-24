// To find the frequedcy of numbers of an array
#include<stdio.h>

int main(){
    int n,c;
    int key;
    printf("Enter the length of array: ");
    scanf("%d",&n);
    int arr[n];
    int hash[n+1];
    
    for(int i=0;i<n;i++){
        printf("Enter %d element: ",i);
        scanf("%d",&arr[i]);
    }

    printf("Enter key element: ");
    scanf("%d",&key);

    for(int i=0;i<n;i++){
        hash[arr[i]] += 1;
    }
    printf("Number of occurance of %d is %d",key,hash[key]);
}