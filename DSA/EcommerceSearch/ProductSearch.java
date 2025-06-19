import java.util.Arrays;
import java.util.Comparator;

public class ProductSearch {

    public static Product linearSearchByName(Product[] products, String name) {
        for (Product p : products) {
            if (p.name.equalsIgnoreCase(name)) {
                return p;
            }
        }
        return null;
    }

    public static Product binarySearchByPrice(Product[] products, double price) {
        // Sort by price first
        Arrays.sort(products, Comparator.comparingDouble(p -> p.price));

        int left = 0, right = products.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (products[mid].price == price) return products[mid];
            if (products[mid].price < price) left = mid + 1;
            else right = mid - 1;
        }
        return null;
    }
}
