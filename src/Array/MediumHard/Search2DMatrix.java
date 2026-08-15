package Array.MediumHard;

public class Search2DMatrix {
    static boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        int n = row * col;

        int s = 0;
        int e = n-1;

        while(s <= e){
            int mid = s + (e-s)/2;
            int rowIndex = mid/col;
            int colIndex = mid%col;

            if(matrix[rowIndex][colIndex] == target){
                return true;
            }
            else if( matrix[rowIndex][colIndex] > target){
                e = mid -1;
            }
            else{
                s = mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7}, {10,11,16,20}, {23,30,34,60}};
        int target = 11;
        System.out.println(searchMatrix(matrix, target));
    }
}
