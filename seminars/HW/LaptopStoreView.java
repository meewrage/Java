package seminars.HW;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class LaptopStoreView {
    private Scanner scanner;

    public LaptopStoreView() {
        scanner = new Scanner(System.in);
    }

    // Method to get the user's input for the filtering criteria
    public Map<Integer, Object> getFilterCriteria() {
        Map<Integer, Object> criteria = new HashMap<>();

        System.out.println("Введите номер команды: ");
        System.out.println("1 - RAM");
        System.out.println("2 - Storage");
        System.out.println("3 - Operating system");
        System.out.println("4 - Color");

        int criterion = scanner.nextInt();
        System.out.println("Enter the minimum value for the selected criterion:");
        Object value = null;
        switch (criterion) {
            case 1:
            case 2:
                value = scanner.nextInt();
                break;
            case 3:
            case 4:
                scanner.nextLine(); // Consume newline character
                value = scanner.nextLine();
                break;
            // Add more cases for additional criteria as needed
            default:
                System.out.println("Invalid criterion!");
        }

        criteria.put(criterion, value);
        return criteria;
    }

    // Method to display the list of laptops that meet the filter criteria
    public void displayFilteredLaptops(List<Laptop> laptops) {
        if (laptops.isEmpty()) {
            System.out.println("No laptops match the filtering criteria.");
        } else {
            System.out.println("Filtered Laptops:");
            for (Laptop laptop : laptops) {
                System.out.println(laptop);
            }
        }
    }

    // Method to close the scanner (call this when the application is exiting)
    public void closeScanner() {
        scanner.close();
    }
}
