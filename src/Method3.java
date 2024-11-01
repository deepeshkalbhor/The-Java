import java.util.Scanner;

class Function {
    int maximum(int max, int num1, int num2, int num3) {
        max = num1;
        if (max < num2) {
            max = num2;
        }
        if (max < num3) {
            max = num3;
        }
        return max;
    }

    int minimum(int min, int num1, int num2, int num3) {
        min = num1;
        if (min > num2) {
            min = num2;
        }
        if (min > num3) {
            min = num3;
        }
        return min;
    }
}

public class Method3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int max = 0;
        int min = 0;
        Function func = new Function();

        int largest = func.maximum(max, num1, num2, num3);
        System.out.println("Maximum number is" + " " + largest);

        int smallest = func.minimum(min, num1, num2, num3);
        System.out.println("Minimum number is" + " " + smallest);
    }
}

