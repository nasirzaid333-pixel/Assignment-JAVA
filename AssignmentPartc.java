 import java.util.Scanner;

public class AssignmentPartc {

    // Function: takes int, returns binary as a String
    static String toBinaryString(int num) {
        String binary = "";
        int temp = num;

        while (temp > 0) {
            binary = (temp % 2) + binary;  // build string right to left
            temp = temp / 2;
        }

        if (binary.isEmpty()) return "0";
        return binary;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        String result = toBinaryString(num);

        System.out.println(num + " in binary = " + result);
    }
}


