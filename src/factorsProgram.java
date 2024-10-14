import java.util.Scanner;
public class factorsProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number here :");
        int num = sc.nextInt();

        System.out.print("Factors of this number are : ");
        for(int i = 1; i <= num; i++)
        {
            if(num % i == 0)
            {
                System.out.print(i + " ");
            }
        }
    }
}
