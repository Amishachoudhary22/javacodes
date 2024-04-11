// search for element x in the matrix
import java.util.*;
public class searchxmat {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col =sc.nextInt();
        int[][] mat= new int [row][col];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                mat[i][j]= sc.nextInt();
            }
        }
        // for(int i=0; i<row; i++){
        //     for(int j=0; j<col; j++){
        //         System.out.print(x[i][j]+ " ");
        //     }
        //     System.out.println();

        // }
        int x= sc.nextInt();
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(mat[i][j] == x){
                    System.out.print("X found at position" + " " + i + " " + j);
                }
                // else{
                //     System.out.print("X not found :(");
                // }
            }
        }
    }
}
