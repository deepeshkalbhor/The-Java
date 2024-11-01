import java.util.Scanner;

public class Method11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = Sum(n);
        System.out.println(ans);
    }
    static int Sum(int n){
    int sum = 0;
        for (int i = 0; i <= n; i++)
    {
        sum = sum + i;
    }
        return(sum);
    }
}
