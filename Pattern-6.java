/*
 
INPUT: 5

 Output:

1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15  
 
 */

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int n = in.nextInt();
    int k = 0;

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++)
        System.out.print(++k + " ");
      System.out.println();
    }

  }
}