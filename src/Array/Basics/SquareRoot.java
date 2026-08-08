package Array.Basics;

import java.util.Scanner;

public class SquareRoot {
        static int mySqrt(int x) {
            int s = 1;
            int e = x;
            int ans = -1;
            if (x == 0){
                return 0;
            }

            while(s <= e){
                int mid = s + (e-s)/2;

                if( mid == x/mid){
                    return mid;
                }
                else if( mid > x/mid ){
                    e = mid -1;
                }
                else{
                    ans = mid;
                    s = mid + 1;
                }
            }
            return ans;
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number ");
        int x = sc.nextInt();
        System.out.println("----------------------------------------------");
        System.out.println("The Square root of number (Rounded) is " + mySqrt(x));
    }
    }

