/*
INPUT:5

Output:

1 2 3 4 5 
 2 3 4 5 
  3 4 5 
   4 5 
    5 

*/

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int i = n; i >= 1; i--)
        {
          int k = (n+1) - i;
          for(int j=1; j <= n-i; j++)
            System.out.print(" ");
            
          for(int j = 1; j <= i; j++){
            System.out.print(k++ + " ");
          }
          System.out.print("\n");
        }
    }
}
