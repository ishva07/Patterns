/*
INPUT:5

Output:

1 0 0 0 0 
0 2 0 0 0 
0 0 3 0 0 
0 0 0 4 0 
0 0 0 0 5

*/

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int i = 1; i <= n; i++){
          
          for(int j = 1; j <= n; j++){
            if(i == j)
              System.out.print(j + " ");
            else 
              System.out.print(0 + " ");
          }
          System.out.print("\n");
        }
        
    }
}