package Arrays.Basics;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Scanner;
public class ContainDuplicate {

    static boolean duplicate(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for(int i : arr){
            if(set.contains(i)){
                return true;
            }
            set.add(i);
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array dimensions");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Array elements");
        for (int i=0 ; i< arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Does it contain duplicates = ");
        System.out.print(duplicate(arr));

    }
}
