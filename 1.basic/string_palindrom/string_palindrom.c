// wap to check wheather a string in palindrom or not
#include<stdio.h>
#include <stdbool.h>
#include <string.h>
bool S_palindrom(char s[]){
    bool flag=false;
    int n=strlen(s); // c syntax
    for(int i=0;i<n/2;i++){
        if(s[i]!=s[n-i*2-1]){
            flag=false;
            break;
        }
        flag=true;

    }
    return flag;
}
int main(){
    char s[50];
    printf("Enter the string: ");
    scanf("%s",&s);
    bool ans = S_palindrom(s);
    if(ans==true)
        printf("Palindrom");
    else
        printf("Not");
}