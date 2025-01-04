//Pattern-2
/*
 * INPUT: 5
  
* Output:
  
  1
  2 2
  3 3 3
  4 4 4 4
  5 5 5 5 5
 * 
 */
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            // Space Print
            for (int j = 1; j <= (n - i); j++)
                System.out.print(" ");
            // Star print
            for (int j = 1; j <= i; j++)
                System.out.print(i + " ");

            System.out.println();
        }

    }
}
