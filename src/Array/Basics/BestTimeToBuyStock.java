package Array.Basics;

import java.util.Scanner;

public class BestTimeToBuyStock {
    static int maxprofit(int[] price){
        int n = price.length;
        int max = 0;
        int buy = price[0];

        for(int i = 1 ; i<n ; i++){

            if(price[i] < buy){
                buy = price[i];
            }
            int profit = price[i] - buy;
            if (profit > max) {
                max = profit;
            }
        }
        return max;
    }



    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter Array dimensions");
        int n = sc.nextInt();
        int[] price = new int[n];
        System.out.println("Enter Array Elements");
        for(int i = 0 ; i < n ; i++){
            price[i] = sc.nextInt();
        }
        System.out.println("The Max Profit is " + maxprofit(price));
    }
}
