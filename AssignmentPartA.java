
    import java.util.Scanner;

public class AssignmentPartA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        String binary = "";
        int temp = num;

        while (temp > 0) {
            binary = (temp % 2) + binary;  // prepend remainder
            temp = temp / 2;
        }

        if (binary.isEmpty()) binary = "0";

        System.out.println(num + " in binary = " + binary);
    }
}

