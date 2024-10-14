import java.util.Scanner;
public class primeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your 1st number here: ");
        int num1 = sc.nextInt();
        System.out.println("Enter your 2nd number here: ");
        int num2 = sc.nextInt();

        int flag = 0;
        for(int i = num1; i <= num2; i++)
        {
            for(int j = 2; j<i; j++) {
                if (i % j == 0)
                {
                    flag = 1;
                    break;
                }
            }
            if(flag == 0)
            {
                System.out.println(i + " ");
            }
            flag = 0;
        }

    }
}
