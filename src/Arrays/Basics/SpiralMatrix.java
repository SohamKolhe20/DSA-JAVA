package Arrays.Basics;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public List<Integer> spiralOrder(int[][] matrix) {
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

}
