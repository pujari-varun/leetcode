class Question1{
    public static void main(String[] args) {
        int[] arr={5,7,6,9,2};
        int[] first=new int[5];
        int[] second=new int[5];
        first[0]=arr[0];
        second[0]=arr[1];
        int f=1,s=1;
        for(int i=2;i<arr.length;i++){
            int number=arr[i];

            int countoffirst=0,countofsecond=0;
            for(int x:first){
                if(x>number){countoffirst++;}
            }
            for(int y:second){
                if(y>number){countofsecond++;}
            }
            if(countoffirst>countofsecond){
                first[f]=number;
                f++;
            }
            else if(countofsecond>countoffirst){
                second[s]=number;
                s++;
            }
            else if(countoffirst==countofsecond){
                if(f<=s){
                    first[f]=number;
                    f++;
                }
                else if(s<f){
                    second[s]=number;
                    s++;
                }
            }
        }
        s=0;
        while(f<arr.length){
            first[f]=second[s];
            s++;
            f++;
        }
        for(int x:first){
            System.out.print(x+" ");
        }
        
    }
}