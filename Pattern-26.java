/*
INPUT:5

Output:

5 
5 4 
5 4 3 
5 4 3 2 
5 4 3 2 1

*/

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int i = 1; i <= n; i++){
          int k = n;
          for(int j = 1; j <= i; j++){
            System.out.print(k-- + " ");
          }
           
          System.out.print("\n");
        }
    }
}