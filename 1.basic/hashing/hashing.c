// To find the frequedcy of numbers of an array
#include<stdio.h>
#include<string.h>

int main(){
    int n;
    int key;
    printf("Enter the length of array: ");
    scanf("%d",&n);
    int arr[n];
    int hash[n+1];// = {0} --> this happen in c++ and to do this we have to use memset

    // ptr ==> Starting address of memory to be filled
    // x   ==> Value to be filled
    // n   ==> Number of bytes to be filled starting 
    //         from ptr to be filled
    //void *memset(void *ptr, int x, size_t n);
    // to use memset we have to use string.h {#include<string.h>} preprocessor 
    memset(hash,0,sizeof(hash));
    
    for(int i=0;i<n;i++){
        printf("Enter %d element: ",i);
        scanf("%d",&arr[i]);
    }

    for(int i=0;i<n;i++){
        hash[arr[i]] += 1;
    }
    printf("Enter key element: ");
    scanf("%d",&key);

    printf("output is %d",hash[key]);
}