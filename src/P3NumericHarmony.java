/*
Pattern:

1111
2222
3333
4444
 */


import java.util.Scanner;

public class P3NumericHarmony {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

    }
}


