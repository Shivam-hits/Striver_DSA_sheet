//Q to reverse a givern array

#include<stdio.h>
#include<stdlib.h>
int *R_array(int n,int *arr){
    int *arr2 = malloc(sizeof(int) * n);
    for(int i=0;i<n;i++)
    {
        arr2[i]=arr[n-i-1];
    }
    return arr2;

}
int main(){
    int n;
    printf("enter the size of array: ");
    scanf("%d",&n);
    int arr[n];
    for(int i=0;i<n;i++){
        printf("enter %d element of array: ",i);
        scanf("%d",&arr[i]);
    }
    
    int *arr2=R_array(n,arr);
    printf("Reverse of the array in \n");
    for(int i=0;i<n;i++){
        printf("%d ",arr2[i]);
    }
}
