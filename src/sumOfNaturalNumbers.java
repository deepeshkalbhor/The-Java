import java.util.Scanner;

public class sumOfNaturalNumbers {
    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number :");
        int n = sc.nextInt();

        int sum = 0;
        for (i = 0; i <= n; i++)
        {
            sum = sum + i;
        }
        System.out.println("Sum of N natural numbers :" + sum);
    }
}



