// To find the frequedcy of numbers of an array
#include<iostream>
using namespace std;

int main(){
    int n;
    int key;    
    cout<<"Enter the length of array: ";
    cin>>n;
    int arr[n];
    int hash[13]={0};
    for(int i=0;i<n;i++){
        cout << "Enter the "<< i <<" element ";
        cin >> arr[i];
    }
    for(int i=0;i<n;i++){
        hash[arr[i]] += 1;
    }
    cout<<"Enter the element: ";
    cin>>key;
    cout<<"output "<<hash[key];
}