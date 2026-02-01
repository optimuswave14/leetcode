import java.util.ArrayList;
import java.util.List;

public class KidwExtraCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res=new ArrayList<>();
        int max=0;
        for (int c:candies){
            if(c>max){
                max=c;
            }
        }
        for(int c:candies){
            res.add(c+extraCandies>=max);
        }
        return res;
    }
}
