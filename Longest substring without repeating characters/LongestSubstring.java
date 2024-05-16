import java.util.HashMap;
import java.util.Scanner;
public class LongestSubstring{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String s=input.next();
        int len=Lsl(s);
        input.close();
        System.out.println(len);
    }
    static int Lsl(String s){
        int len=0;
        int left=0;
        int right=0;
        if(s.length()==0)return 0;
        HashMap<Character,Integer> hash=new HashMap<>();
        while(right<s.length()){
            char c=s.charAt(right);
            if(hash.containsKey(c)){
                left=Math.max(hash.get(c)+1,left);
            }
            hash.put(c,right);
            len=Math.max(len,right-left+1);
            right++;

        }
        
        return len;
    }
}