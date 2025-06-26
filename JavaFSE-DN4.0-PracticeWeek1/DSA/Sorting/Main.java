public class Main {
    public static void main(String[] args) {
        Order[] orders = {
            new Order(101, "Harini", 799.0),
            new Order(102, "Harshini", 1299.0),
            new Order(103, "Dharshini", 499.0)
        };

        System.out.println("Before Sorting:");
        for (Order o : orders) {
            o.display();
        }

        BubbleSort.sort(orders);

        System.out.println("\nAfter Sorting by Price (Low to High):");
        for (Order o : orders) {
            o.display();
        }
    }
}
