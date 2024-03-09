import java.util.Scanner;
public class primeNumber {
    public static void main(String[] args) {
        System.out.print("Enter the number : ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        String isprime = IsPrime(number);
        if(isprime.equals("Yes")){
            System.out.println(number + " is a prime number");
        }
        else{
            System.out.println(number +  " is not a prime number");
        }
    }

    public static String IsPrime( int number){
        int i = 2;
        while(i<number){
            if(number % i ==0){
                return "No";
            }
            i++;
        }
        return "Yes";
    }
}
