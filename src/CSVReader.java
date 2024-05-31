import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {
    public static void readProductsFromCSV(String filePath, Catalog catalog) {
        String line;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            br.readLine(); // Skip header line

            while ((line = br.readLine()) != null) {
                String[] productData = line.split(",");
                int id = Integer.parseInt(productData[0]);
                String name = productData[1];
                double price = Double.parseDouble(productData[2]);
                String description = productData[3];

                Product product = new Product(id, name, price, description);
                catalog.add(product);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

