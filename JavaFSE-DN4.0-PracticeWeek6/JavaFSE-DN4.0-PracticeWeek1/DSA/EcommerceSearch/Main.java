import java.util.Scanner;

public class Main {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Shoes", 999),
            new Product(2, "Watch", 1499),
            new Product(3, "Headphones", 799)
        };

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to search by name, 2 to search by price:");
        int choice = sc.nextInt();
        sc.nextLine(); 

        Product result = null;

        if (choice == 1) {
            System.out.print("Enter product name: ");
            String name = sc.nextLine();
            result = ProductSearch.linearSearchByName(products, name);
        } else if (choice == 2) {
            System.out.print("Enter product price: ");
            double price = sc.nextDouble();
            result = ProductSearch.binarySearchByPrice(products, price);
        }

        if (result != null) {
            System.out.println("Product found:");
            result.display();
        } else {
            System.out.println("Product not found.");
        }

        sc.close();
    }
}
