package Array.Basics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class SpiralMatrix {

    static List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> result = new ArrayList<>();
        int Startrow=0;
        int Endrow = m-1;
        int Startcol = 0;
        int Endcol = n-1;

        while( Startrow <= Endrow && Startcol <= Endcol){

            //First the horizontal row (1,2,3)
            for( int col = Startcol ; col<= Endcol ; col++){
                result.add(matrix[Startrow][col]);
            }
            Startrow++;

            // Now vertical downward col
            for( int row = Startrow ; row <= Endrow ; row++){
                result.add(matrix[row][Endcol]);
            }
            Endcol--;

            //Now horizontal from right to left
            if( Startrow<=Endrow ){
                for( int col = Endcol ; col >= Startcol ; col--){
                    result.add(matrix[Endrow][col]);
                }
                Endrow--;
            }

            //Now vertical from bottom to top
            if(Startcol<=Endcol){
                for(int row = Endrow ; row >= Startrow; row--){
                    result.add(matrix[row][Startcol]);
                }
                Startcol++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Dimensions ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];
        System.out.println("Enter Array elements");
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println(" Spiral printed elements ");
        for (Integer i : spiralOrder(matrix)) {
            System.out.print(i + " ");

        }


    }

}
