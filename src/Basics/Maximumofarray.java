package Basics;

import java.util.Scanner;
public class Maximumofarray {
    public static void main(String[] args) {
        System.out.println("Maximum of array");
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array provided");
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("--------------------------------------");
        int mm = arr[0];
        for (int i = 0; i < 5; i++) {
            if (arr[i] > mm) {
                mm = arr[i];
            }
        }
        System.out.println("Max element is = " + mm);

    }
}
