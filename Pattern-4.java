/*
 
INPUT: 5

Output:
12345
1234
123
12
1

 */


import java.util.Scanner;

class Main{
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);
    
    int n = in.nextInt();
    
    for(int i = 5; i >=1; i--){
        // print star 
      for(int j= 1; j <= i; j++)
        System.out.print(j);
        
      System.out.println();
    }
    
  }
}