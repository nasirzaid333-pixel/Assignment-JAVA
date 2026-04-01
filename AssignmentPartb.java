import java.util.Scanner;

public class AssignmentPartb {
    // USER DIFINED FUNCTION
    static int[] inttobinary(int num) {
        // creating variebles 
        int temporary = num;
        int count = 0;
        // this is used count digits only
        while (temporary > 0) {
            temporary = temporary / 2;
            count++;
        }
        // here we create array of required size 
        int[] binary = new int[count];

        // here we storing digits
        for (int i = count - 1; i >= 0; i--) {
            binary[i] = num % 2;
            num = num / 2;
        }
        // after counting and storing here we return array
        return binary;
    }

       // program starts running from here
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter integer");
        int num = input.nextInt();
            
        // calling  function 

        int[] result = inttobinary(num);
        System.out.print("Binary=");
        // printing result by using enhanced for loop or for each loop and this is last step
        for (int bit : result) {
            System.out.print(bit);
        }
    }

}

    

