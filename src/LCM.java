import java.util.Scanner;
public class LCM {
    public static void main(String[] args) {
        System.out.println("Welcome to LCM calculator of two number : ");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int first = input.nextInt();
        System.out.print("Enter the second number : ");
        int second = input.nextInt();
        int LCM = LCMOfTwoNumbers(first, second);
        System.out.println("LCM of " + first + " and " + second + " is : " + LCM);
    }

    public static int LCMOfTwoNumbers(int first , int second){
        int i=1;
        while(i<=second){
            int factor = first * i;
            if(factor%second ==0){
                return factor;
            }
            i++;
        }
        return 0;
    }
}
