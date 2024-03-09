import java.util.Scanner;

import static java.lang.String.valueOf;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(" Welcome to sum of digits calculator : ");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = input.nextInt();
        int lengthOfNumber = String.valueOf(number).length();
        System.out.println(" The length of number is : " + lengthOfNumber);
        int sum = SumOfDigits(number);
        System.out.println(" And the sum of the digits of " + number + " is : " + sum);
    }

    public static int SumOfDigits(int number){
        int summation = 0;
        while(number > 0) {
            summation += number % 10;
            number /= 10;
        }
        return summation;
    }
}