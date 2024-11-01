import java.util.Scanner;

public class Method5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        vote(age, 18);
    }
    static void vote(int age, int a)
    {
        if(age > a)
        {
            System.out.println("Allowed to vote");
        }
        else
        {
            System.out.println("Not allowed to vote");
        }
    }
}

