/*
 *****
 ****
 ***
 **
 *

 */

import java.util.Scanner;

public class P9InvertedStarPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int star = 1; star <=(n+1)-i ; star++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
