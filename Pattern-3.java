/*
 
INPUT: 5

Output:
1
12
123
1234
12345

 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            // print star
            for (int j = 1; j <= i; j++)
                System.out.print(j);

            System.out.println();
        }

    }
}
