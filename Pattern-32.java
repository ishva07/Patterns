/*
INPUT:5

Output:

* * * * * * * * 
 *           * 
  *         * 
   *       * 
    *     * 
     *   * 
      * * 
       * 

*/

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int i = n; i >= 1; i--){
          for(int j=(n-i); j >= 1; j--)
            System.out.print(" ");
          for(int j = 1; j<= i; j++)
           {
                if(j ==1 || j==i || i== n)
                  System.out.print("* ");
                else
                  System.out.print("  ");
           }
          System.out.println();
        }
    }
}