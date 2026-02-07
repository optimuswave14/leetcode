class Solution {
    public int findKthPositive(int[] arr, int k) {
        int low=0,high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int target=arr[mid]-(mid+1);

            if(target<k)
                low=mid+1;
            else 
                high=mid-1;
        }
        return low+k;
    }
}