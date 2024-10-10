import java.util.Scanner;
public class LCMOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int l1 = n1;
        int l2 = n2;

        while(n1 % n2 != 0)
        {
            int rem = n1 % n2;
            n1 = n2;
            n2 = rem;
        }
        int lcm = (l1 * l2)/n2;

        System.out.println(lcm);
    }
}
