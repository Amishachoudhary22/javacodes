import java.lang.*;
import java.util.*;
class divby7
{
public static void main(String arg[])
{
int num;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number:");
num = sc.nextInt();
if (num%7==0 && num<200)
System.out.println("Number is divisible");
else if(num>200)
System.out.println("Invalid input");
else
System.out.println("Number not Divisible");
}}

