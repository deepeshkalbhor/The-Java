import java.util.Scanner;

public class largestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number :");
        int num1 = sc.nextInt();
        System.out.println("Enter your second number :");
        int num2 = sc.nextInt();
        System.out.println("Enter your third number :");
        int num3 = sc.nextInt();

        if(num1 > num2 && num1 > num3)
        {
            System.out.println("First number is largest");
        }
        else if(num2 > num3 && num2 > num1)
        {
            System.out.println("Second number is largest");
        }
        else
        {
            System.out.println("Third is largest");
        }
    }
}
