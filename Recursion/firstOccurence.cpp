#include<iostream>
using namespace std;

int firstOccurence(int arr[],int size,int current_idx,int target) {

    // Base Case
    if(current_idx==size - 1){
        if(arr[current_idx] == target){
            return current_idx;
        }
        return -1;
    }

    if(target == arr[current_idx]){
        return current_idx;
    }

    return firstOccurence(arr,size,current_idx+1,target);
}

int main(){

    // Code goes here
    int arr[] = {1,5,7,6,2};
    int size = sizeof(arr)/sizeof(int);

    cout<<firstOccurence(arr,size,0,7)<<endl;

    return 0;
}