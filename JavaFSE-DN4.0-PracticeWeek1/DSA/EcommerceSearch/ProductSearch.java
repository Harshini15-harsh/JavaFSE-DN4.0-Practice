import java.util.Arrays;
import java.util.Comparator;

public class ProductSearch {

    public static Product linearSearchByName(Product[] products, String name) {
        for (Product product : products) {
            if (product.name.equalsIgnoreCase(name)) {
                return product;
            }
        }
        return null;
    }

    public static Product binarySearchByPrice(Product[] products, double price) {
        // Sort by price before binary search
        Arrays.sort(products, Comparator.comparingDouble(p -> p.price));

        int low = 0;
        int high = products.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (products[mid].price == price) {
                return products[mid];
            } else if (products[mid].price < price) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return null;
    }
}
