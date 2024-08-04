import java.util.Scanner;

/*
You need to develop a simple Java application to print a given pattern using a loop
structure.
Pattern to Print:
*
*
*
*


Print the Given Pattern
. Use a for loop to iterate 4 times.
. Inside the loop, print the asterisk ( * ) followed by a newline character.
 */
public class P1AsteriskSymphony {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("*");

        }

    }
}
