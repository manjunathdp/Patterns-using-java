/*

Pattern:
  *
 ***
*****
 */
import java.util.Scanner;

public class P14StarTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("input: ");


        int n = sc.nextInt();
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= ((i*2)-1); star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
