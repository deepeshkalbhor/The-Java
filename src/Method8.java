import java.util.Scanner;

public class Method8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double Circumference = circumference(r);
        double Area = area(r);
        System.out.println("Circumference is " + Circumference);
        System.out.println("Area is " + Area);
    }
    static double circumference(double r)
    {
        return(2 * Math.PI * r);
    }
    static double area(double r)
    {
        return(Math.PI * r * r);
    }
}
