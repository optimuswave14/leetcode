public class KthSmallProd2SortedArr {
    public long kthSmallestProduct(int[] nums1, int[] nums2, long k) {
        long low=-10000000000L;
        long high=10000000000L;

        while(low<high){
            long mid=low+(high-low)/2;

            if(countLessEqual(nums1,nums2,mid)>=k){
                high=mid;
            } else {
                low=mid+1;
            }
        }
        return low;
    }
    private long countLessEqual(int[] nums1,int[] nums2,long x){
        long count=0;
        int m=nums2.length;

        for(int a:nums1){
            if(a==0){
                if(x>=0) count+=m;
            } else if(a>0){
                long target=floorDiv(x,a);
                count+=upper(nums2,target);
            } else {
                long target=ceilDiv(x,a);
                count+=m-lower(nums2,target);
            }
        }
        return count;
    }
    private long floorDiv(long x, long y) {
        long r = x / y;
        if ((x ^ y) < 0 && x % y != 0) r--;
        return r;
    }
    private long ceilDiv(long x, long y) {
        long r = x / y;
        if ((x ^ y) > 0 && x % y != 0) r++;
        return r;
    }
    private int upper(int[]arr,long target){
        int l=0,r=arr.length;
        while(l<r){
            int mid=(l+r)/2;
            if(arr[mid]<=target)  l=mid+1;
            else r=mid;
        }
        return l;
    }
    private int lower(int[] arr,long target){
        int l=0,r=arr.length;
        while(l<r){
            int mid=(l+r)/2;
            if(arr[mid]<target)  l=mid+1;
            else r=mid;
        }
        return l;
    }
}
