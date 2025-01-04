/*
INPUT:5

Output:

1 2 3 4 5 
 2 3 4 5 
  3 4 5 
   4 5 
    5 
   4 5 
  3 4 5 
 2 3 4 5 
1 2 3 4 5 

*/

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 1; i <= n * 2 - 1; i++) {
            if (i <= n) {
                int k = i;
                for (int j = 1; j <= i - 1; j++)
                    System.out.print(" ");
                for (int j = 1; j <= (n + 1) - i; j++)
                    System.out.print(k++ + " ");
            } else {
                int k = (n * 2) - i;

                for (int j = 1; j < k; j++)
                    System.out.print(" ");

                for (int j = 1; j <= (i - n) + 1; j++)
                    System.out.print(k++ + " ");

            }
            System.out.print("\n");
        }
    }
}