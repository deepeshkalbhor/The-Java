import java.util.Scanner;

public class fibonacciSequence {
    public static void main(String[] args) {
        int i;
        int fibonacci = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number :");
        int num = sc.nextInt();

        System.out.println("Fibonacci Sequence");

        for(i = 0; i<=num; i++)
        {
            fibonacci = fibonacci + i;
            System.out.println(fibonacci);
        }
    }
}
