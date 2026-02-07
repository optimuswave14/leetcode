import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingEles {
    public List<Integer> findMissingElements(int[] nums){
        List<Integer> list=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            int curr=nums[i];
            int next=nums[i+1];
            for(int x=curr+1;x<next;x++){
                list.add(x);
            }
        }
        return list;
    }
}
