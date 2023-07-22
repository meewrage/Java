package seminars.HW;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LaptopStoreController {
    private List<Laptop> laptops;
    private LaptopStoreView view;

    public LaptopStoreController(List<Laptop> laptops, LaptopStoreView view) {
        this.laptops = laptops;
        this.view = view;
    }

    
    public List<Laptop> filterLaptops(Map<Integer, Object> criteria) {
        List<Laptop> filteredLaptops = new ArrayList<>();

        for (Laptop laptop : laptops) {
            boolean meetsCriteria = true;

            for (Map.Entry<Integer, Object> entry : criteria.entrySet()) {
                int criterion = entry.getKey();
                Object value = entry.getValue();

                switch (criterion) {
                    case 1: // RAM
                        int minRam = (int) value;
                        if (laptop.getRam() < minRam) {
                            meetsCriteria = false;
                        }
                        break;
                    case 2: // Storage
                        int minStorage = (int) value;
                        if (laptop.getStorage() < minStorage) {
                            meetsCriteria = false;
                        }
                        break;
                    case 3: // Operating System
                        String os = (String) value;
                        if (!laptop.getOs().equalsIgnoreCase(os)) {
                            meetsCriteria = false;
                        }
                        break;
                    case 4: // Color
                        String color = (String) value;
                        if (!laptop.getColor().equalsIgnoreCase(color)) {
                            meetsCriteria = false;
                        }
                        break;
                    
                }

                if (!meetsCriteria) {
                    break;
                }
            }

            if (meetsCriteria) {
                filteredLaptops.add(laptop);
            }
        }

        return filteredLaptops;
    }
}

