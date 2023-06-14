package tests.collections;

import java.util.*;

public class AppInventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        HashMap<String, Integer> stringHashMap = new HashMap<String, Integer>();
        TreeMap<String, Integer> stringTreeMap;
        int option = 0;

        System.out.println("Inventory");
        System.out.println("* --- * --- * --- * --- * --- * --- * ");

        while (option != 8) {
            System.out.println("\nSelect an option: ");
            System.out.println("1. Add product");
            System.out.println("2. Add more stock");
            System.out.println("3. Delete stock");
            System.out.println("4. List products");
            System.out.println("5. Delete a product");
            System.out.println("6. Order products asc");
            System.out.println("7. Order products desc");
            System.out.println("8. Exit");
        }
        try {
            System.out.print("Enter an option: ");
            option = scanner.nextInt();
            String product;
            int stock, currentStock;
            switch (option) {
                case 1:
                    System.out.print("\nEnter the product: ");
                    product = scanner.next();
                    if (stringHashMap.containsKey(product)) {
                        System.out.println("That product already exists");
                    } else {
                        stringHashMap.put(product, 0);
                        System.out.println("Product added successfully");
                    }
                    break;
                case 2:
                    System.out.print("\nEnter the product: ");
                    product = scanner.next();
                    if (stringHashMap.containsKey(product)) {
                        System.out.print("Enter the quantity: ");
                        stock = scanner.nextInt();
                        if (stock > 0) {
                            currentStock = stringHashMap.get(product);
                            stringHashMap.put(product, currentStock + stock);
                            System.out.println("Stock added successfully");
                        }
                    } else {
                        System.out.println("Product not found");
                    }
                    break;
                case 3:
                    System.out.print("\nEnter the product: ");
                    product = scanner.next();
                    if (stringHashMap.containsKey(product)) {
                        System.out.print("Enter the quantity: ");
                        stock = scanner.nextInt();
                        if (stock > 0) {
                            currentStock = stringHashMap.get(product);
                            if (currentStock > stock) {
                                stringHashMap.put(product, currentStock - stock);
                            } else {
                                System.out.println("There is no stock");
                            }
                        } else {
                            System.out.println("You can't delete an empty stock");
                        }
                    } else {
                        System.out.println("Product not found");
                    }
                    break;
                case 4:
                    System.out.println("Listed products");
                    for (String value : stringHashMap.keySet()) {
                        stock = stringHashMap.get(value);
                        System.out.println();
                        System.out.println("Name" + value);
                        System.out.println("Stock: " + stock);
                    }
                    break;
                case 5:
                    System.out.print("\nEnter the product: ");
                    product = scanner.next();
                    if (stringHashMap.containsKey(product)) {
                        stringHashMap.remove(product);
                        System.out.println("Product deleted successfully");
                    } else {
                        System.out.println("Product not found");
                    }
                    break;
                case 6:
                    stringTreeMap = new TreeMap<>(new OrganizeAsc());
                    stringTreeMap.putAll(stringHashMap);
                    for (String value : stringTreeMap.keySet()) {
                        stock = stringTreeMap.get(value);
                        System.out.println();
                        System.out.println("Name" + value);
                        System.out.println("Stock: " + stock);
                    }
                    break;
                case 7:
                    stringTreeMap = new TreeMap<>(new OrganizeDesc());
                    stringTreeMap.putAll(stringHashMap);
                    for (String value : stringTreeMap.keySet()) {
                        stock = stringTreeMap.get(value);
                        System.out.println();
                        System.out.println("Name" + value);
                        System.out.println("Stock: " + stock);
                    }
                    break;
                case 8:
                    System.out.println();
                    System.out.println("Goodbye.");
                    option = 8;
                    break;
                default:
                    System.out.println();
                    System.out.println("Try again");
                    break;
            }
        } catch (InputMismatchException exception) {
            System.out.println();
            System.out.println("Try again, only numbers allowed");
            scanner.next();
        }
    }
}
