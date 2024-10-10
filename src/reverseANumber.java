import java.util.Scanner;
public class reverseANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number here:");
        int num = sc.nextInt();

        int rev = 0;

        while(num !=0)
        {
            rev = rev*10 + num%10;
            num = num/10;
        }
        System.out.println("After reversing the number the output is : " + rev);
    }
}
