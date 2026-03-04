import java.util.*;

public class Asment4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // GIFT voucher amount
        double Gva;

        System.out.println("Enter Gift voucher price");
        Gva = sc.nextDouble();

        // Ic = item cost
        double Ic;
        while (true) {
            System.out.println("Enter item price And item price cannot be negative");
            Ic = sc.nextDouble();
            if (Ic < 0) {
                System.out.println("you enter negative so Shopping finished");

                break;

            }

            else if (Ic <= Gva) {
                double bal;
                bal = Gva - Ic;
                System.out.println("Remaining balance =" + bal);

                Gva = bal;
            }

            else {
                System.out.println("not enough balance");

                break;
            }

        }
        sc.close();
    }

}