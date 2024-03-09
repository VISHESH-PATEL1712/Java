import java.util.Scanner;
public class ReverseTheNumber {
    public static void main(String[] args) {
        System.out.print("Enter the number : ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int reverse = ReverseTheNumber(number);
        System.out.println("Reverse of " + number + " is : " + reverse);

    }
    public static int ReverseTheNumber( int number){
        int newNumber= 0;
        while (number >0){
            int digit = number%10;
            newNumber = newNumber * 10 + digit;
            number = number / 10;
        }
        return newNumber;
    }
}
