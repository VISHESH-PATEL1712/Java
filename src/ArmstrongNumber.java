import java.util.Scanner;
class ArmstrongNumber{
    public static void main(String[] args) {
        System.out.println("Welcome to Armstrong Number checker ");
        System.out.print("Enter the number : ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        boolean isArmstrong = isArmstrong(number);
        if(isArmstrong){
            System.out.println(number + " is an Armstrong number");
        }
        else {
            System.out.println(number + " is not an Armstrong number");
        }
    }

    public static boolean isArmstrong( int number){
        int digits = NoOfDigits(number);
        int finalNumber = 0;
        int value = number;
        while(number >0){
            int digit = number % 10;
            number = number /10;
            finalNumber = finalNumber + power(digit, digits);
        }
        return (finalNumber == value);
    }

    public static int NoOfDigits(int number){
        int digit = 0;
        while(number>0){
            digit++;
            number = number / 10;
        }
        return digit;
    }

    public static int power(int first, int second){
        int i =0;
        int result = 1;
        while (i<second){
            result = result * first;
            i++;
        }
        return result;
    }
}