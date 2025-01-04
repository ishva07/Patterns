/*
INPUT:5

Output:

     *
    * *
   * * *
  * * * *
 * * * * *
  * * * *
   * * *
    * *
     *

*/

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    for (int i = 1; i <= (n * 2) - 1; i++) {

      if (i <= n) {
        for (int j = 1; j <= (n - i); j++)
          System.out.print(" ");

        for (int j = 1; j <= i; j++)
          System.out.print(" *");
      } else {
        for (int j = 1; j <= (i - n); j++)
          System.out.print(" ");

        for (int j = 1; j <= (n * 2 - i); j++)
          System.out.print(" *");
      }

      System.out.println();
    }

  }
}