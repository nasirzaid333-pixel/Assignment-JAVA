
/*write a program in java that takes length and Breadth(in inches)
of the place that is to be carpeted, the price of the carpet in sqaure
foot.last input will be discount percentage .your program should
print the price of carpet for the given area,before discount 
and after discount , both values */

import java.util.Scanner;

public class Asment1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // input length in inches

        System.out.println("Enter length in inches");
        double length = input.nextDouble();

        // input Breadth in inches

        System.out.println("Enter Breadth in inches");
        double breadth = input.nextDouble();

        // price per sqaure foot
        System.out.println("Enter price per sqaure foot");
        double ppsf = input.nextDouble();

        // discount amount or percentage
        System.out.println("Enter discount percentage");
        double dp = input.nextDouble();

        // convert area to sqaure feet
        double areasqft = (length * breadth) / 144.0;
        // price before discount /total price
        double tp = ppsf * areasqft;
        // discount amount
        double da = tp * (dp / 100);
        // final price
        double fp = tp - da;

        System.out.println("Area in sqaure feet \n"+areasqft);
        System.out.println("price before discount \n"+tp);
        System.out.println("price after discount \n"+fp);
     
        input.close();
    }
}