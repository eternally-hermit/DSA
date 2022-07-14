package Recursion;

public class BinarySearch {

    static int binarySearch(int[] nums,int key,int start,int end){
        if(start > end) return -1;
        int mid = start + (end - start)/2;
        if(nums[mid] == key) return mid;
        

        int idx = Integer.MIN_VALUE;

        if(key < nums[mid]){
            idx = binarySearch(nums, key, start, mid - 1);
        } else {
            idx = binarySearch(nums, key, mid+1, end);
        }

        return idx;
    }

    public static void main(String[] args) {
        int[] nums = {1,4,6,8,12,14,16};
        int idx = binarySearch(nums,14,0,6);
        System.out.println(idx); 
    }
    
}
