import java.util.Scanner;

public class AssignmentPartc {

    // creating user difined function
    static String inttobinary(int num) {
        // creating string variable to store the answer

        String binary = "";
        // using while loop to convert integers intobinary 
        while (num > 0) {
            int remainder = num % 2;
            binary = remainder + binary;
            num = num / 2;
        }
        // after storing  return it 
        return binary;
    }
    //  Main method
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
         System.out.println("Enter integer");
        int num=input.nextInt();
          // calling function which we create 

        String result=inttobinary(num);
        // printing result 
        System.out.println("Binary ="+ result);
    }

}

