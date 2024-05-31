
public class Main {
    public static void main(String[] args) {
        String csvFilePath = "archivo.csv";
        String catalogFilePath = "catalog.dat";
        Catalog catalog=new Catalog();
        // Si el catálogo está vacío, cargar los productos desde el CSV
        if (catalog.getProducts().isEmpty()) {
            catalog = new Catalog();
            CSVReader.readProductsFromCSV(csvFilePath, catalog);
        }
        // Guardar el catálogo al salir
        System.out.println("Productos exportados correctamente!");
        CatalogSaver.saveCatalog(catalog, catalogFilePath);
    }
}


