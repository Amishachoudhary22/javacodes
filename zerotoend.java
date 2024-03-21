import java.util.Scanner;

public class zerotoend {
    public int[] zeroend(int[] arr){
        int j=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=0 && arr[j]==0){
                int temp=arr[i];
                arr[i] =arr[j];
                arr[j] =temp;
            }
            if(arr[j]!=0){
                j++;
            }
            
        }
        return arr;

    }
    public static void main(String[] args){
        zerotoend re= new zerotoend();
        
        Scanner sc = new Scanner(System.in);
        int len =sc.nextInt();
        int[] arr = new int[len];
        for (int i=0; i<len; i++){
            
            arr[i] =sc.nextInt();
        }
        int zeroAtend[]= re.zeroend(arr);
        for(int i=0; i<zeroAtend.length; i++){
            System.out.print(zeroAtend[i] + " "); 
        }
         
    }

}
