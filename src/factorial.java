import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        int i;
        int fact = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int num = sc.nextInt();

        for(i = 1; i<=num; i++)
        {
            fact = fact*i;
        }
        System.out.println("Factorial of your entered number is : " + fact);
    }
}
