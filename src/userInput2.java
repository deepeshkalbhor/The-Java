import java.util.Scanner;

public class userInput2 {
    public static void main(String[] args) {
        int quotient;
        int remainder;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number");
        int num1 = sc.nextInt();
        System.out.println("Enter your second number");
        int num2 = sc.nextInt();
        quotient = num1 / num2;
        remainder = num1 % num2;
        System.out.println("quotient is : " + quotient);
        System.out.println("remainder is : " + remainder);
    }
}
