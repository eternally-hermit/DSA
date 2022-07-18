#include<iostream>
using namespace std;

bool sorted_array(int nums[],int array_len,int index){

    // Base Case
    if (index+1 == array_len){
        if(nums[index] <= nums[index+1]) return true;
        return false;
    }

    if( 
        nums[index]<=nums[index+1]
        and 
        sorted_array(nums,array_len,index +1)
     ) return true;

     return false;
}

bool isSorted(int nums[],int n){
    // Base Case
    if(n == 1 ) return true;

    if(nums[0]<nums[1] and isSorted(nums+1,n-1)){
        return true;
    }

    return false;
}

int main() {
    int nums[] = {1,2,3,4,5};
    cout<<sorted_array(nums,sizeof(nums)/sizeof(int),0)<<endl;
    cout<<isSorted(nums,sizeof(nums)/sizeof(int));
    return 0;
}