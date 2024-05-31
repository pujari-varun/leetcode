class Solution {
    public String addBinary(String a, String b) {
        if(a=="")return b;
        if(b=="")return a;
        char[] c=new char[Math.max(a.length(),b.length())];
        
        char carry='0';
        int k=c.length-1;
        int m=a.length();
        int n=b.length();
        int i=m-1,j=n-1;
        
        while(i>=0 && j>=0){
            if(a.charAt(i)=='1' && b.charAt(j)=='1'){
                if(carry=='1'){c[k]='1';}
                else{c[k]='0';carry='1';}
            }
            else if(a.charAt(i)=='0' && b.charAt(j)=='0'){
                if(carry=='1'){c[k]='1';carry='0';}
                else{c[k]='0';}
            }
            else{
                if(carry=='0'){c[k]='1';}
                else{c[k]='0';carry='1';}
            }
            i--;j--;k--;
        }
        if(i>=0){
            while(i>=0){
                if(carry=='0'){c[k]=a.charAt(i);}
                else if(a.charAt(i)=='0'){c[k]='1';carry='0';}
                else{c[k]='0';}
                i--;k--;
            }
        }
        if(j>=0){
            while(j>=0){
                if(carry=='0'){c[k]=b.charAt(j);}
                else if(b.charAt(j)=='0'){c[k]='1';carry='0';}
                else{c[k]='0';}
                j--;k--;
            }
        }
        if(carry=='1'){
            char[] d =new char[c.length+1];
            d[0]='1';
            int x=0;
            while(x<c.length){
                d[x+1]=c[x];
                x++;
            }
            return new String(d);
        }
        else{
            return new String(c);
        }
        
        
    }
}