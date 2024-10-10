import java.util.Scanner;
public class fibonacciUptoNthTerm {
    public static void main(String[] args) {


        int firstTerm = 0;
        int secondTerm = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number :");
        int n = sc.nextInt();

        while (firstTerm < n) {
            System.out.println(firstTerm);
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
