package Array.MediumHard;

import java.util.Scanner;

public class BookAllocation {

    static boolean isValidSolution(int[] books, int k , int MaxPages){
        int s = 1;
        int e = MaxPages;
        int StudentCount = 1;
        int pages = 0;

        for (int i = 0; i< books.length; i++){
            if( pages + books[i] <= MaxPages){
                pages = pages + books[i];
            }
            else{
                StudentCount++;
                pages = 0;
                if (StudentCount > k || books.length > MaxPages){
                    return false;
                }
                else{
                    pages = pages + books[i];
                }
            }
        }
        return true ;
    }
    static int FindMinofMaxPages(int[] books, int k){
        int n = books.length;
        int sum = 0;
        int ans = -1;
        for (int i =0 ; i <n ; i++){
            sum += books[i];
        }
        int start = 1;
        int end = sum;

        while(start <= end){
            int mid = start + (end-start)/2;

            if (isValidSolution(books, k, mid)){
                ans = mid;
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Length");
        int n = sc.nextInt();
        System.out.println("Enter Array ELements in sorted order");
        int[] books = new int[n];
        for (int i = 0 ; i< n; i++){
            books[i] = sc.nextInt();
        }
        System.out.println("Enter Number of Students");
        int k = sc.nextInt();
        System.out.println("The Minimum of Maximum Pages is " + FindMinofMaxPages(books,k));
    }
}
