/*

1234
1234
1234
1234

 */

import java.util.Scanner;

public class P7UniformNumerals {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input: ");
        int n = sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
