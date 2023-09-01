import java.util.*;
public class multiplication {
    public static void main(String[] args) {
        int a[][] = new int[2][2];
        int b[][] = new int[2][2];
        int c[][] = new int[2][2];
        int i,j,k;
        System.out.println("AMAN, 21842");
        Scanner input = new Scanner(System.in);
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                a[i][j] = input.nextInt();
            }
        }
        System.out.println("My first matrix is:");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {

                System.out.print(a[i][j]);
                System.out.print("\t");
            }
            System.out.print("\n");


        }
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                b[i][j] = input.nextInt();
            }
        }
        System.out.println("My second matrix is:");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {

                System.out.print(b[i][j]);
                System.out.print("\t");
            }
            System.out.print("\n");
        }
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                c[i][j] = 0;
                for (k = 0; k < 2; k++) {
                    c[i][j] = c[i][j] + a[i][k] * b[k][j];

                }
            }

        }
        System.out.println("my matrix after multiplication:");


        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                System.out.print(c[i][j]);
                System.out.print("\t");


            }
            System.out.print("\n");
        }
    }
}
