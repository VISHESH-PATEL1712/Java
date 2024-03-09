import java.util.Scanner;
public class GreatestOfThree {
    public static void main(String[] args){
        System.out.println(" Lets find out greatest of three numbers");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the first number : ");
        double  first = input.nextDouble();
        System.out.print("Please enter the second number : ");
        double  second = input.nextDouble();
        System.out.print("Please enter the third number : ");
        double third = input.nextDouble();

        if ( first >= second && first >= third){
            System.out.println( first + " is the largest among the three numbers");
        }
        else if ( second >= first && second >= third){
            System.out.println( second + " is the largest among the three numbers");
        }
        else if ( third >= first && third >= second){
            System.out.println( third + " is the largest among the three numbers");
        }
    }
}
