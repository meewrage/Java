package seminars.lessions;

import java.util.LinkedList;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args){
//семинар 4. принять от польховаткля строку, рассплитить по ~, сохранить text в связанный список на позицию num.
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Введите строку: ");
        String str ="";
        LinkedList<String> arr = new LinkedList<>();
        while (!str.equals("exit")) {
            str = scanner.nextLine();
            String[] st = str.split("~");
            if (!st[0].equals("print")) {
                //arr.add(Integer.parseInt(st[1]), st[0]);

            }
            if (st[0] instanceof String) {
                arr.add(Integer.parseInt(st[1]), st[0]);

            }
        }

    scanner.close();
    }
}
