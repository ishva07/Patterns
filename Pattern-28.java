/*
INPUT:5

Output:

1 
2 1 
3 2 1 
4 3 2 1 
5 4 3 2 1 

*/

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int i = 1; i <= n; i++)
        {
          for(int j = i; j >= 1; j--){
            System.out.print(j + " ");
          }
          System.out.print("\n");
        }
    }
}