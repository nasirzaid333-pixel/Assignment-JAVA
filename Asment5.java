import java.util.Scanner;

public class Asment5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[3][3];

        System.out.println("Checking magic sqaure");

        // this loop is use to take input

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter element of row" + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {

                arr[i][j] = sc.nextInt();
            }
        }
        // this loop is used to show output
        System.out.println("\nMatrix enterted is: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();

        // all rows and colums must be eqaul so we take frist row as refrence
        int sum = arr[0][0] + arr[0][1] + arr[0][2];

        boolean ismagic = true;
        // now checking rows if they have equal sum or not
        for (int i = 0; i < 3; i++) {
            int rowsum = 0;
            for (int j = 0; j < 3; j = j + 1) {
                rowsum = rowsum + arr[i][j];
            }
            if (rowsum != sum) {
                ismagic = false;
            }

        }
        // now checking coulums if they have equal sum or not

        for (int i = 0; i < 3; i++) {
            int colsum = 0;
            for (int j = 0; j < 3; j = j + 1) {
                colsum = colsum + arr[i][j];
            }
            if (colsum != sum) {
                ismagic = false;
            }

        }
        // now checking diagonal elements
        int diag1 = arr[0][0] + arr[1][1] + arr[2][2];
        int diag2 = arr[0][2] + arr[1][1] + arr[2][0];
        if (diag1 != sum || diag2 != sum) {
            ismagic = false;
        }

        // final case or result
        if (ismagic) {
            System.out.println("It is a magic sqaure");
        } else {
            System.out.println("It is not a magic sqaure");
        }
    }
}
