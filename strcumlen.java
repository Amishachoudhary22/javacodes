/* Take an array of Strings input from the user & 
find the cumulative (combined) length of all those strings.
*/
import java.util.*;
public class strcumlen {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int size =sc.nextInt();
            int total=0;
            String[] array = new String[size];
            for(int i=0; i<size; i++){
                array[i] = sc.next();
                total += array[i].length();
            }

            System.out.print(total);

        }
}
