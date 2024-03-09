import java.util.Scanner;
public class GCD {
    public static void main(String[] args) {
        System.out.println("Welcome to GCD calculator");
        System.out.print("Enter the first number : ");
        Scanner input = new Scanner(System.in);
        int first = input.nextInt();
        System.out.print("Enter the second number : ");
        int second = input.nextInt();
        int gcd = gcdOfTwoNumbers(first ,second);
        System.out.println("GCD of " + first + " and " + second + " is : " + gcd);
    }

    public static int gcdOfTwoNumbers( int first , int second){
        int gcd = 1;
        int i = 2;
        int leastnumber = least(first , second);
        while (i<=leastnumber){
            if ( first % i == 0 && second % i ==0) {
                gcd = i;
            }
            i++;
        }
        return gcd;
    }

    public static int least(int first , int second){
        if(first>second){
            return second;
        }
        else{
            return first;
        }
    }
}
