import java.util.Scanner;

import javax.swing.text.AbstractDocument.LeafElement;

;

public class pascals_tringle {
    public static int[][] ptringle(int rows) {
        int[][] tringle = new int[rows][];
        for (int i = 0; i < rows; i++) {
            tringle[i] = new int[i + 1];
            tringle[i][0] = 1;
            for (int j = 1; j < i; j++) {
                tringle[i][j] = tringle[i - 1][j - 1] + tringle[i - 1][j];
            }
            tringle[i][i] = 1;
        }
        return tringle;
    }

    public static void printArryas(int[][] tringle) {
        for (int i = 0; i < tringle.length; i++) {
            for (int j = 0; j < tringle[i].length; j++) {
                System.out.print(tringle[i][j] + " ");
            }
            System.out.println();
        }
        ///// hello////
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        ptringle(rows);
        int tringle[][] = ptringle(rows);
        printArryas(tringle);

    }

}
