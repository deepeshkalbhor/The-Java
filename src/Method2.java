import java.util.Scanner;

class sum
{
    int add(int x, int y)
    {
        return(x + y);
    }
}

public class Method2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x value :");
        int x = sc.nextInt();
        System.out.println("Enter y value :");
        int y = sc.nextInt();
        sum s = new sum();

        int Sum = s.add(x, y);
        System.out.println(Sum);
    }
}


