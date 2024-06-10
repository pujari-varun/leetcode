import java.lang.Character;
class ValidPalindrome{
    public boolean isPalindrome(String s) {
        if(s.isEmpty() || s==null){return true;}
        int i=0,j=s.length()-1;
        while(i<j){
            while(i<j && Character.isLetterOrDigit(s.charAt(i))==false){i++;}
            while(j>i && Character.isLetterOrDigit(s.charAt(j))==false){j--;}

            if(i<j && Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(j))){return false;}
            i++;j--;
        }

        return true;

    }
}