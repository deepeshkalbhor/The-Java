import java.util.Scanner;

public class multiplicationOfTwoDecimals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number");
        float dec1 = sc.nextFloat();
        System.out.println("Enter your second number");
        float dec2 = sc.nextFloat();
        System.out.println("Multiplication of your numbers is : " + dec1*dec2);
    }
}
