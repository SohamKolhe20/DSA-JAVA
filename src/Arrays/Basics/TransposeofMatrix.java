package Arrays.Basics;

import java.util.Scanner;

public class TransposeofMatrix {

        static int[][] transpose(int[][] matrix) {
            int m = matrix.length;
            int n = matrix[0].length;

            if(matrix == null || matrix.length == 0)
                return new int [0][0];
            int newm = n;
            int newn = m;

            int [][] ans = new int[newm][newn];

            for(int row = 0 ; row < m ; row++){
                for(int col = 0 ; col < n ; col++){
                    ans[col][row] = matrix[row][col];
                }
            }
            return ans;
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Rows in 2d array");
        int m = sc.nextInt();
        System.out.println("Columns in 2d array");
        int n = sc.nextInt();
        int[][] matrix = new int[m][n] ;
        System.out.println(" Give Matrix elements");
        for(int row = 0 ; row < m ; row++){
            for(int col = 0 ; col < n ; col++){
                matrix [row][col] = sc.nextInt();
            }
        }
        int[][] answer = transpose(matrix);
        for(int row = 0 ; row < answer.length ; row++){
            for(int col = 0 ; col < answer[0].length ; col++){
                System.out.print(answer[row][col] + " ");
            }
        }


    }
    }
