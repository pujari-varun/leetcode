import java.util.Scanner;

public class Rotate{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter array size:"); 
        int size=input.nextInt();
        System.out.println("enter the array integers:");
        int[] arr=new int[size];
        for(int a=0;a<size;a++){
            arr[a]=input.nextInt();
        }
        System.out.println("enter n value:");
        int n=input.nextInt();
        

        
        
        int[] temp=new int[n];
        int i=0;
        while(i<n){
            temp[i]=arr[i];
            i++;
        }
        i=0;
        int j=n;
        while(j<arr.length){
            arr[i]=arr[j];
            i++;
            j++;
        }
        j=0;
        while(j<temp.length){
            arr[i]=temp[j];
            i++;
            j++;
        }
        print(arr);
        
    }
    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}