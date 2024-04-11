/* 
 Print the spiral order matrix as output for a given matrix of numbers. 
 */
import java.util.*;

public class spiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] mat = new int[m][n];

        // Input matrix elements
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int rowstart = 0;
        int rowend = m - 1;
        int colstart = 0;
        int colend = n - 1;

         //To print spiral order matrix
      while(rowstart <= rowend && colstart <= colend) {
        //1
        for(int col=colstart; col<=colend; col++) {
            System.out.print(mat[rowstart][col] + " ");
        }
        rowstart++;


        //2
        for(int row=rowstart; row<=rowend; row++) {
            System.out.print(mat[row][colend] +" ");
        }
        colend--;


        //3
        for(int col=colend; col>=colstart; col--) {
            System.out.print(mat[rowend][col] + " ");
        }
        rowend--;


        //4
        for(int row=rowend; row>=rowstart; row--) {
            System.out.print(mat[row][colstart] + " ");
        }
        colstart++;


        System.out.println();
    }
 }
}
