/*
INPUT:5

Output:

5        
  4      
    3    
      2  
        1

*/

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int i = n; i >= 1;  i--){
          
          for(int j = n; j >= 1; j--)
            if(i == j)
              System.out.print(j);
            else
              System.out.print("  ");
          System.out.println();
        }
        
    }
}