package Array.Easy;

public class rowAndMaximumOnes {
    static int[] rowAndMaximumOnes(int[][] mat) {

        int totalRow = mat.length;
        int totalCol = mat[0].length;

        int max = -1;
        int r = -1;

        for (int row = 0; row < totalRow; row++){

            int NoOfOnce = 0;

            for (int col = 0; col < totalCol; col++){

                if (mat[row][col] == 1){
                    NoOfOnce++;
                }
            }

            if (NoOfOnce > max){
                max = NoOfOnce;
                r = row;
            }
        }
        return new int[]{r, max};
    }

    public static void main(String[] args) {
        int[][] mat = {{0,0},{1,1},{0,0}};
        int[] ans = rowAndMaximumOnes(mat);
        for (int i = 0; i<ans.length;i++){
            System.out.print(ans[i] + " ");
        }
    }
}
