/*
 *****
 ****
 ***
 **
 *

 */

public class P9InvertedStarPyramid {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int star = 1; star <=6-i ; star++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
