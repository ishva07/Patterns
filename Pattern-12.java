/*
 
INPUT: 5

Output:

*****
 ****
  ***
   **
    *

 */

import java.util.Scanner;

class Main{
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    
    for(int i = n; i >= 1; i--){
      // Printing Space
      for(int j=1; j<=(n-i); j++)
        System.out.print(" ");
      
      // Printing Star
      for(int j= 1; j<=i;j++)
        System.out.print("*");
       
      System.out.println();
    }
    
  }
}