import java.util.Scanner;
public class Missingno {
    public int missingno(int[] arr){
        int n=arr.length+1;
        int sum= (n*(n+1))/2;
        for(int i=0; i<arr.length; i++){
            sum = sum-arr[i];
        }
        return sum;
    }
    public static void main(String[] args){
        Missingno mn = new Missingno();
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        int[] ar = new int[no];
        for(int i=0; i<no; i++){
            ar[i] = sc.nextInt();
        }

        int sum = mn.missingno(ar);
        System.out.print(sum);
    }
}
