import java.util.Scanner;

public class removeevennumbers {

    public int[] removeEven(int[] arr){
        int oddcount =0;
        for (int i=0; i<arr.length; i++){
            if(arr[i]%2 !=0){
                oddcount++;
            }
        }
        int[] result= new int[oddcount];
        int index =0;
        for (int i=0; i<arr.length; i++){
            if(arr[i]%2 !=0){
                result[index] =arr[i];
                index++;
            }
        }
        return result;

    }
    public static void main(String[] args){
        removeevennumbers re= new removeevennumbers();
        
        Scanner sc = new Scanner(System.in);
        int len =sc.nextInt();
        int[] arr = new int[len];
        for (int i=0; i<len; i++){
            
            arr[i] =sc.nextInt();
        }
        int result[]= re.removeEven(arr);
        for (int i=0; i<=len; i++){
            System.out.print(result[i]+ " ");
        } 
    }
}
