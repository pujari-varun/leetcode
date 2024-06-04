import java.util.Arrays;
public class Merge_Sorted_Array {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int i=0,j=0,k=0;
        int[] temp=Arrays.copyOfRange(nums1,0,m);
        while(i<m && j<n){
            if(temp[i]<=nums2[j]){
                
                    nums1[k]=temp[i];
                
                i++;
                k++;
            }
            else{
                
                nums1[k]=nums2[j];
                k++;
                j++;
            }
        }
        while(i<m){
            nums1[k]=temp[i];
            k++;i++;
        }
        while(j<n){
            nums1[k]=nums2[j];
            j++;k++;
        }
            
        

    }
    public static void main(String[] args) {
        int[] m={1,2,3,0,0,0};
        int[] n={2,5,6};
        Merge_Sorted_Array x=new Merge_Sorted_Array();
        x.merge(m,3,n,n.length);
        int i=0;
        while(i<m.length){
        System.out.println(m[i]);
        i++;
        }
    }

}
