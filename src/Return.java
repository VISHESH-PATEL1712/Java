import java.util.Scanner;
public class Return {
    public static void main(String[] args){
           int FirstNumber = InputtingValue();
           int SecondNumber = InputtingValue();
           int addition = FirstNumber + SecondNumber;
        System.out.println("Addition of two numbers using method is : " + addition );
    }

    public static int InputtingValue() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number :");
        int value = input.nextInt();
        return value;
    }

}
