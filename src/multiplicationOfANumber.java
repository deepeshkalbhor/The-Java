import java.util.Scanner;

public class multiplicationOfANumber {
    public static void main(String[] args) {
        int i;
        int mul;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int num = sc.nextInt();

        System.out.println("Multiplication of your entered number is :");

        for(i = 1; i <= 10  ; i++)
        {
            mul = num*i;
            System.out.println(mul);
        }
    }
}
