import java.util.*;
class palindrome{
    public boolean isPalindrome(String word) {
        char[] chararray = word.toCharArray();
        int start=0;
        int end=word.length()-1;
        while(start<end){
            if(chararray[start]!=chararray[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args){
        palindrome p= new palindrome();
        Scanner sc= new Scanner(System.in);
        String word=sc.nextLine();
        if(p.isPalindrome(word)){
            System.out.println(" the string is Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
}