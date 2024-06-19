import java.util.ArrayList;
import java.util.List;

class GreatesNumber_Candies{
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=0,i=0;
        while(i<candies.length){
            if(candies[i]>max){max=candies[i];}
            i++;
        }
        i=0;
        List<Boolean> result=new ArrayList<>(candies.length);
        while(i<candies.length){
            if(candies[i]+extraCandies>=max){
                result.add(true);
            }
            else{
                result.add(false);
            }
            i++;;
        }
        return result;
    }
}