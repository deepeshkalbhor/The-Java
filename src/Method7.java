import java.util.Scanner;

public class Method7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int res = product(num1, num2);
        System.out.println("Product is " + res);
    }

    static int product(int num1, int num2)
    {
        return(num1 * num2);
    }

}
