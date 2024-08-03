public class P13HollowPyramid {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <=4-i ; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            if(i>1) {
                for (int j = 1; j <= ((i - 1) * 2) - 1; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
