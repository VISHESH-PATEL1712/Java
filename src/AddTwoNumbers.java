import java.util.Scanner;
public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first Number : ");
        int firstNumber = input.nextInt();
        System.out.print("Enter second Number : ");
        int secondNumber = input.nextInt();
        int answer = firstNumber + secondNumber;
        System.out.println("Addition of " + firstNumber + " and " + secondNumber + " is : " + answer);

    }
}
