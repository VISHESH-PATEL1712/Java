import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        System.out.println("Welcome to Factorial calculator : ");
        System.out.print("Enter the number : ");
        Scanner input = new Scanner(System.in);
        int number =  input.nextInt();
        long factorial = FactorialOfNumber(number);
        System.out.println("Factorial of " + number + " is : " + factorial);
    }

    public static long FactorialOfNumber( int number){
        if (number < 2){
            return 1;
        }
        long fact = 1;
        int i = 2;
        while (i<=number){
            fact *= i;
            i++;
        }
        return fact;
    }
}
