import java.util.Scanner;
public class SwitchStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number here : ");
        int num1 = sc.nextInt();
        System.out.print("Enter your second number here : ");
        int num2 = sc.nextInt();
        System.out.print("Enter the operation you want to perform : ");
        char operator = sc.next().charAt(0);

        switch(operator){
            case '+':
                System.out.println(num1 + num2);
                break;

            case '-':
                System.out.println(num1 - num2);
                break;

            case '*':
                System.out.println(num1 * num2);
                break;

            case '/':
                System.out.println(num1 / num2);
                break;
        }
    }
}
