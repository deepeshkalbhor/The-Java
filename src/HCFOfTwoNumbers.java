import java.util.Scanner;
public class HCFOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your 1st number here :");
        int n1 = sc.nextInt();

        System.out.println("Enter your 2nd number here :");
        int n2 = sc.nextInt();

        while(n1 % n2 != 0)
        {
            int rem = n1 % n2;
            n1 = n2;
            n2 = rem;
        }

        int hcf = n2;
        System.out.println(hcf);
    }
}
