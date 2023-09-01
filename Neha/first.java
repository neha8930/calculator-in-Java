import java.util.*;
public class multiplication {
    public static void main(String[] args) {
        int a[][] = new int[3][3], i, j, k;
        int b[][] = new int[3][3];
        int c[][] = new int[3][3];
        System.out.println("NEHA, 21834");
        Scanner input = new Scanner(System.in);
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                a[i][j] = input.nextInt();
            }
        }
        System.out.println("My first matrix is:");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {

                System.out.print(a[i][j]);
                System.out.print("\t");
            }
            System.out.print("\n");


        }
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                b[i][j] = input.nextInt();
            }
        }
        System.out.println("My second matrix is:");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++)
            {

                System.out.print(b[i][j]);
                System.out.print("\t");
            }
            System.out.print("\n");
        }
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                c[i][j] = 0;
                for (k = 0; k < 3; k++) {
                    c[i][j] = c[i][j] + a[i][j] * b[i][j];

                }
            }

        }
        System.out.println("my matrix after multiplication:");


        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(c[i][j]);
                System.out.print("\t");



            }
            System.out.print("\n");
        }
    }