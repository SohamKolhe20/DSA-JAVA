package Recursion.Easy;

public class printDigitsRec {
    static void printDigits(int num){
        if (num==0){
            return;
        }

        int digit = num % 10;
        num = num / 10;

        printDigits(num);
        System.out.println(digit);
    }

    public static void main(String[] args) {
        printDigits(145);
    }
}
