package seminars.lessions;

import java.util.HashMap;
import java.util.Map;

public class task0map {
    public static void main(String[] args) {
        Map<String, String> emp = new HashMap<>();
        emp.put("123456", "Ivanov");
        emp.put("5757456", "Rogov");
        emp.put("868856", "Lobov");
        emp.put("24826", "Kozlov");
        emp.put("123247", "Ponov");
        emp.put("174839", "Popov");
        String searchLastName = "Ivanov";
        for(Map.Entry<String,String> entry: emp.entrySet()){
            String passportNumber = entry.getKey();
            String lastName = entry.getValue();
            if (lastName.equals(searchLastName)){
                System.out.println(passportNumber + " lastName is " + lastName);
            }
        }
    }
}