import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);
        
        double a = scanner.nextDouble();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        double average= (a+b+c)/3;
        System.out.print(average);
    }
}
