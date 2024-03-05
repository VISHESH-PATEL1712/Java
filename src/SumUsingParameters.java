import java.util.Scanner;
public class SumUsingParameters {
    public static void main(String[] args) {
        System.out.println("Welcome to addition of two numbers by passing parameters");
        int FirstNumber = TakingInput();
        int SecondNumber = TakingInput();
        addition( FirstNumber, SecondNumber);
    }

    public static int TakingInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = input.nextInt();
        return number;
    }

    public static int addition ( int first , int second) {
        int sum = first + second;
        System.out.println("Addition of two numbers is : " + sum);
        return sum;
    }
}
