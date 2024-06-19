package Pascals_Triangle;


import java.util.ArrayList;
import java.util.List;
class PascalsTriangle{
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle=new ArrayList<>();
        
        if (numRows <= 0) {
            return triangle;
        }


        List<Integer> row1=new ArrayList<>();
        row1.add(1);
        triangle.add(row1);

        int i=1;
        while(i<numRows){
            List<Integer> prev=triangle.get(i-1);
            List<Integer> curr=new ArrayList<>();

            curr.add(1);
            for(int j=1;j<i;j++){
                curr.add(prev.get(j-1)+prev.get(j));
            }
            curr.add(1);
            triangle.add(curr);
            i++;
        }
        return triangle;
    }
}