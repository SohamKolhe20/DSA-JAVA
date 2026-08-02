package Array.Basics;
// Rotate Image - Rotate matrix of dimensions nxn by 90deg
import java.util.Scanner;
// Sol
public class RotateImage {
    static void rotate(int[][] matrix) {
        int m = matrix.length;
        int n = m;
// First we will do Transpose of Matrix, Now here to reduce the space complexity we will not create a new matrix for
// transpose, We will Swap the elements Above the diagonal Line , as if we do it normally, it will swap the number twice
// eg. (0,1) = (1,0) and next it will (1,0) = (0,1)
// by using only the upper or lower diagonal elements, we will swap them
        for(int row = 0 ; row<m ; row++){
            for (int col = row+1 ; col <n ; col++){
                int temp = matrix[row][col];
                matrix[row][col] = matrix[col][row];
                matrix[col][row] = temp;
            }
        }
// Now On transposed matrix, we will perform reverse of array using Two pointer method
// P1 = start and P2 = end and both of them coming towards each other

        for( int i = 0 ; i<n ; i++){
            int a = 0 ;
            int b = n-1;
            while(a<=b){
                int temp = matrix[i][a];
                matrix[i][a] = matrix[i][b];
                matrix[i][b] = temp;
                a++;
                b--;
            }
        }
        for (int i=0 ; i<n;i++){
            for (int j=0 ; j<n;j++){
                System.out.print(matrix[i][j] + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter dimensions");
        int n = sc.nextInt();
        int [][] matrix = new int[n][n];
        System.out.println("Enter elements");
        for (int i=0 ; i< matrix.length;i++){
            for (int j=0 ; j<matrix.length;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Rotated Matrix");
        rotate(matrix);

    }
}
