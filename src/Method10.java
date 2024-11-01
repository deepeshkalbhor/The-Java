import java.util.Scanner;

public class Method10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean ans = palindromeOrNot(num, num);
        System.out.println(ans);
    }
    static boolean palindromeOrNot(int num, int num2) {
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        if (num2 == rev) {
            return true;
        }
        return false;
        }
    }

