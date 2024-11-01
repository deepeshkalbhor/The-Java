import java.util.Scanner;

class EvenOrOdd {
    void even(int num)
    {
            System.out.println("Even");
    }

    void odd(int num)
        {
            System.out.println("Odd");
        }
    }

public class Method4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        EvenOrOdd EorO = new EvenOrOdd();
        if(num % 2 == 0) {
            EorO.even(num);
        }
        else
        {
            EorO.odd(num);
        }
    }
}
