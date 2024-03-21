import java.util.Scanner;
public class agevote {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int age=scanner.nextInt();
        if(age>18){
            System.out.print("Eligible to vote");
        }
        else{
            System.out.print("Not eligible to vote");
        }
    }
}
