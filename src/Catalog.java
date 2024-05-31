import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Catalog implements Serializable {
    private static final long serialVersionUID = 1L;
    private List<Product> products;

    public Catalog() {
        this.products = new ArrayList<>();
    }

    public void add(Product p) {
        products.add(p);
    }
    public List<Product> getProducts() {
        return products;
    }
}
