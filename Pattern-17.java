/*
INPUT:5

Output:

1 
  2 
    3 
      4 
        5

*/

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int i = 1; i <= n;  i++){
          
          for(int j=1; j <= i; j++)
            if(i == j)
              System.out.print(j+ " ");
          else
            System.out.print("  ");
          System.out.println();
        }
        
    }
}