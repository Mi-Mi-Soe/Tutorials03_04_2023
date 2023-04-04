package Tutorials;

public class Tutorial1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        for (int i = 1; i < 8; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k < 8; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
        for (int i = 6; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = i; k < 8; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }

    }

}
