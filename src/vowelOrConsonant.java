import java.util.Scanner;

public class vowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Alphabet");
        char ch = sc.next().charAt(0);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'E' || ch == 'O' || ch == 'U')
        {
            System.out.println("Alphabet is vowel");
        }
        else
        {
            System.out.println("Alphabet is consonant");
        }
    }
}
