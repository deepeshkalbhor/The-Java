import java.util.Scanner;
public class PrimeOrNot {
    public static void main(String[] args) {
        int flag = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number here :");
        int number = sc.nextInt();

        if (number == 0 || number == 1) {
            System.out.println("Number is not prime number");
        }
        else
        {
            int middleNumber = number / 2;
            for (int i = 2; i <= middleNumber; i++) {
                if (number % i == 0) {
                    System.out.println("Number is not prime number");
                    flag = 1;
                    break;
                }
            }
        }
        if(flag == 0)
        {
            System.out.println("Entered number is prime number");
        }
    }
}


