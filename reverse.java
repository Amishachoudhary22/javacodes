import java.util.Scanner;

public class reverse {
    public int[] rev(int[] a ){
        int start=0;
        int end= a.length-1;
        while(start<end){
            int temp =a[start];
            a[start]= a[end];
            a[end]= temp;
            start++;
            end--;
        }
        return a;

    }
    public static void main(String[] args){
        reverse re= new reverse();
        
        Scanner sc = new Scanner(System.in);
        int len =sc.nextInt();
        int[] arr = new int[len];
        for (int i=0; i<len; i++){
            
            arr[i] =sc.nextInt();
        }
        int[] reversedarray = re.rev(arr);
        for (int i=0; i<reversedarray.length; i++){
            System.out.print(reversedarray[i] +" ");
        }
        
    }
}
