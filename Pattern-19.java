/*
INPUT:5

Output:

1 
0 1 
1 0 1 
0 1 0 1 
1 0 1 0 1 

*/

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int i = 1; i <= n;  i++){
          int k = i;
          for(int j = 1; j <= i; j++){
              System.out.print(k%2 + " ");
              k++;
          }
          System.out.println();
        }
        
    }
}