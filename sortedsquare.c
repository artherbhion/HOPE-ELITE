#include<stdio.h>
#include<stdlib.h>
int main(){
    int n;
    printf("Enter no of Elements :");
    scanf("%d",&n);
    int arr[n];
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    for(int i=0;i<n;i++){
        printf("%d ",arr[i]);
    }
}