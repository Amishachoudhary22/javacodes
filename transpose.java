// For a given matrix of N x M, print its transpose.
import java.util.*;
public class transpose {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int row =sc.nextInt();
        int col= sc.nextInt();
        int[][] mat = new int[row][col];
        for (int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                mat[i][j]= sc.nextInt();
            }
        }
        System.out.println("the transpose is: ");
        for (int j=0; j<col; j++){
            for(int i=0; i<row; i++){
                System.out.print(mat[i][j] + " ");

            }
            System.out.println();
        }
    }
}
