import java.util.Scanner;
public class PositiveNegative {
    public static void main(String[] args){
        System.out.println("Welcome to number type checker");
        System.out.println("Please enter any number : ");
        Scanner input = new Scanner(System.in);
        double number = input.nextDouble();
        if ( number < 0) {
            System.out.print( number + " is a negative number");
        }
        else if ( number == 0) {
            System.out.print( number + " is zero");
        }
        if ( number > 0) {
            System.out.print( number + " is a positive number");
        }
    }
}
