import java.util.Scanner;

/*

12345
1234
123
12
1

 */
public class P6DescendingDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input: ");
        int n = sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=(n+1)-i ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
