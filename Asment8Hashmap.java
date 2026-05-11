import java.io.*;
import java.util.*;

public class Asment8Hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        try {
            File file = new File("Data.txt");
            Scanner sc = new Scanner(file);

            // Skip header line
            if (sc.hasNextLine())
                sc.nextLine();

            // loop to read line by line

            while (sc.hasNextLine()) {
                String line = sc.nextLine().trim(); // .trim removes extra space in line

                if (line.isEmpty())
                    continue; // skip empty lines

                String[] parts = line.split("\\s+"); // split by whitespace
                if (parts.length < 7)
                    continue;

                String product = parts[1] + " " + parts[2]; // e.g. "Product A"
                int amout = Integer.parseInt(parts[3]);
                int qty = Integer.parseInt(parts[4]); // Qty column

                int sale = qty*amout;
                
                // checking product if exist just update if not create entry
                if (map.containsKey(product))
                    map.put(product, map.get(product) + sale);
                else
                    map.put(product, sale);
            }
            sc.close();
            // printing hashmap

            for (String key : map.keySet()) {
                System.out.println(key + ": " + map.get(key));
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
 
