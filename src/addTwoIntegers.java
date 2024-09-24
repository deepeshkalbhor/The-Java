import java.util.Scanner;

public class addTwoIntegers{
    public static void main(String a[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number");
        int num = sc.nextInt();
        System.out.println("Enter your second number");
        int num2 = sc.nextInt();
        System.out.println(num + num2);
    }
}
