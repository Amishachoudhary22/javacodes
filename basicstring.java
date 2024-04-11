import java.util.*;
public class basicstring {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name= sc.nextLine();
        String lastname= sc.nextLine();
        String fullname= name+ " " + lastname;
        
        for(int i=0; i<fullname.length(); i++){
            System.out.println(fullname.charAt(i));
        }
        System.out.println(fullname.length());

    }
    

}
