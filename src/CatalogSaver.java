import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class CatalogSaver {
    public static void saveCatalog(Catalog catalog, String filePath) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(catalog);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

