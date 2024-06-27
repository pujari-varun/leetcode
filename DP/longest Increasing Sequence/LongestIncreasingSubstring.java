import java.util.ArrayList;
class LongestIncreasingSubstring{
    public static int lengthOfLIS(int[] nums) {
        ArrayList<Integer> result=new ArrayList<>();
        result.add(nums[0]);

        for(int i=1;i<nums.length;i++){

            if(nums[i]>result.get(result.size()-1)){
                result.add(nums[i]);
            }
            else{
                int index=binarysearch(result,nums[i]);
                if(index<0){
                    index=-index-1;
                    result.set(index,nums[i]);
                }
            }
        }
        return result.size();
    }
    private static int binarysearch(ArrayList<Integer> list, int key) {
        int low = 0;
        int high = list.size() - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int midVal = list.get(mid);

            if (midVal < key) {
                low = mid + 1;
            } else if (midVal > key) {
                high = mid - 1;
            } else {
                return mid; // key found
            }
        }
        return -(low + 1);  // key not found.
    }
    public static void main(String[] args) {
        int[] nums={10,9,2,5,3,7,101,18};
        System.out.println(lengthOfLIS(nums));
        
    }
}