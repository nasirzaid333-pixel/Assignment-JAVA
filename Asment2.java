import java.util.Scanner;

public class Asment2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to my marks calculator");

        System.out.println("Enter your marks ");
        int marks = input.nextInt();

        if (marks < 0 || marks > 100) {
            System.out.println("Inavalid marks Enter marks again");
        }

        else if (marks >= 85) {
            System.out.println("Grade A");
        }

        else if (marks >= 71) {
            System.out.println(" Grade B");
        }

        else if (marks >= 60) {
            System.out.println(" Grade C");
        }

        else if (marks >= 50) {
            System.out.println(" Grade D");
        }

        else if (marks < 50) {
            System.out.println(" Grade F");
        }
        input.close();
    }
}