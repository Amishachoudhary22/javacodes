import java.util.Scanner;

public class secondmax {

    public int secmax(int[] arr){
        int secomax=0;
        
        int max = 0;
        for(int i=0; i<arr.length; i++){
            if (arr[i] > max){
                secomax=max;
                max= arr[i];
            }
            else if (arr[i] >  secomax && arr[i] != max){
                secomax=arr[i];
            }
            
        }
        return secomax;
        
    }
    public static void main(String[] args){
        secondmax re= new secondmax();
        
        Scanner sc = new Scanner(System.in);
        int len =sc.nextInt();
        int[] arr = new int[len];
        for (int i=0; i<len; i++){
            
            arr[i] =sc.nextInt();
        }
        int seconmax= re.secmax(arr);
        System.out.println(seconmax);  
    }
}
