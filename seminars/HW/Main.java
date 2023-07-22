package seminars.HW;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Laptop> laptops = new ArrayList<>();
        laptops.add(new Laptop("HP", "Pavilion", 8, 512, "Windows 10", "Silver"));
        laptops.add(new Laptop("Dell", "Inspiron", 16, 1024, "Windows 11", "Black"));
        laptops.add(new Laptop("Lenovo", "IdeaPad", 8, 256, "Windows 10", "Gray"));
        laptops.add(new Laptop("Apple", "MacBook Air", 8, 256, "macOS", "Silver"));
        laptops.add(new Laptop("Asus", "VivoBook", 12, 512, "Windows 10", "Blue"));

        LaptopStoreView view = new LaptopStoreView();
        LaptopStoreController controller = new LaptopStoreController(laptops, view);

        Map<Integer, Object> criteria = view.getFilterCriteria();
        List<Laptop> filteredLaptops = controller.filterLaptops(criteria);

        view.displayFilteredLaptops(filteredLaptops);
        view.closeScanner();
    }
}
