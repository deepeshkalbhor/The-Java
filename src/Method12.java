import java.util.Scanner;

public class Method12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int ans = prime(num1, num2);
        System.out.println(ans);
    }
    static int prime(int num1, int num2)
    {
        int flag = 0;
        int i;
        for(i = num1 ; i <= num2; i++)
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
        return(i);
    }
}
