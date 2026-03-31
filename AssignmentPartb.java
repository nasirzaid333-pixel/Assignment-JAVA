import java.util.Scanner;

public class AssignmentPartb {

    // Function: takes int, returns int array of binary digits
    static int[] toBinaryArray(int num) {
        int temp = num;
        int count = 0;

        // Count how many bits we need
        while (temp > 0) {
            count++;
            temp = temp / 2;
        }

        int[] bits = new int[count];
        temp = num;

        // Fill array from the end (LSB to MSB)
        for (int i = count - 1; i >= 0; i--) {
            bits[i] = temp % 2;
            temp = temp / 2;
        }

        return bits;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        int[] result = toBinaryArray(num);

        System.out.print(num + " in binary = ");
        for (int bit : result) {
            System.out.print(bit);
        }
        System.out.println();
    }
}
    

