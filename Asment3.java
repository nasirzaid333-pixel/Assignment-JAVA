import java.util.*;

public class Asment3 {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int pop = 1;
        int total = 0;

        while (true) {

            System.out.println("Enter a number (Negative to stop):");

            pop = inp.nextInt();
            if(pop<0){
                break;
            }

            total = total + pop;
        }
        System.out.println(total);
        inp.close();
    }
}