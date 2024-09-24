public class swapNumbers {
    public static void main(String[] args) {
        int x = 3;
        int y = 2;
        System.out.println("Before Swapping");
        System.out.println("x : " + x);
        System.out.println("y : " + y);
        int t;
        t = x = 3;
        x = y = 2;
        t = y = 3;
        System.out.println("After Swapping");
        System.out.println("x : " + x);
        System.out.println("y : " + y);
    }
}
