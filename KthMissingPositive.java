public class KthMissingPositive {
    public int kthMissingNo(int[] arr,int k){
        int l=0,h=arr.length-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            int target=arr[mid]-(mid+1);
            if(target<k)
                l=mid+1;
            else 
                h=mid-1;
        }
        return l+k;
    }
}
