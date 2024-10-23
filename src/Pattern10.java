public class Pattern10 {
    public static void main(String[] args) {

        int n = 5;

        /*
             *
            * *
           * * *
          * * * *
         * * * * *

         */

        for(int i = 1; i <= n; i++){
            int totalColsInRow = i;
            int noOfSpaces = n - i;
            for(int s = 0; s < noOfSpaces; s++){
                System.out.print(" ");
            }
            for(int j = 0; j < totalColsInRow; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
