import java.util.Scanner;
public class simpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Simple Interest Calculator\n");
        System.out.print("Enter the Principal Amount in Rupees : ");
        double principal = input.nextDouble();
        System.out.print("Enter the Rate of Interest in Percentage : ");
        double rateOfInterest = input.nextDouble();
        System.out.print("Enter the number of Years : ");
        double years = input.nextDouble();
        double SimpleInterest = (principal * rateOfInterest * years) / 100;
        System.out.println("Your Simple Interest is : " + SimpleInterest + " Rupees");
    }
}
