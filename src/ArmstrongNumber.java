import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number here: ");
        int num = sc.nextInt();

        int t1 = num;
        int leng = 0;

        while(t1 != 0)
        {
            t1 = t1/10;
            leng = leng + 1;
        }

        int t2 = num;
        int rem;
        int arm = 0;

        while(t2 != 0)
        {
            rem = t2 % 10;
            int mul = 1;

            for(int i = 1; i <= leng; i++)
            {
                mul = mul * rem;
            }
            arm = arm + mul;
            t2 = t2 / 10;
        }
        if(arm == num)
        {
            System.out.println("Number is Armstrong Number");
        }
        else
        {
            System.out.println("Entered number is not Armstrong Number");
        }
    }
}
