import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args){
        System.out.println("Welcome to Even and Odd number checker");
        System.out.print("Please enter any interer number : ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if ( number % 2 == 0){
            System.out.println( number + " is an even number");
        }
        else{
            System.out.println( number + " is a odd number");
        }

    }
}
