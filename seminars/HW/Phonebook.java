package seminars.HW;
import java.util.*;


public class Phonebook {
    private Map<String, List<String>> contacts;

    public Phonebook() {
        contacts = new HashMap<>();
    }

    public void addContact(String name, String phoneNumber) {
        List<String> phoneNumbers = contacts.getOrDefault(name, new ArrayList<>());
        phoneNumbers.add(phoneNumber);
        contacts.put(name, phoneNumbers);
    }

    public void removeContact(String name) {
        contacts.remove(name);
    }

    public void searchContact(String name) {
        List<String> phoneNumbers = contacts.get(name);
        if (phoneNumbers != null) {
            System.out.println("Имя: " + name);
            System.out.println("Номер: " + phoneNumbers);
        } else {
            System.out.println("Контакт не найден.");
        }
    }

    public void printAllContacts() {
        List<Map.Entry<String, List<String>>> sortedContacts = new ArrayList<>(contacts.entrySet());
        sortedContacts.sort(Comparator.comparingInt(entry -> entry.getValue().size()));
        Collections.reverse(sortedContacts);

        for (Map.Entry<String, List<String>> entry : sortedContacts) {
            System.out.println("Имя: " + entry.getKey());
            System.out.println("Номер: " + entry.getValue());
            System.out.println("---------------------------");
        }
    }

    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Меню:");
            System.out.println("1. Добавить контакт");
            System.out.println("2. Удалить контакт");
            System.out.println("3. Найти контакт");
            System.out.println("4. Показать все контакты");
            System.out.println("5. Выход");
            System.out.print("Введите каманду: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // 

            switch (choice) {
                case 1:
                    System.out.print("Введите имя: ");
                    String name = scanner.nextLine();
                    System.out.print("Введите номер: ");
                    String phoneNumber = scanner.nextLine();
                    phonebook.addContact(name, phoneNumber);
                    System.out.println("Контакт добавлен.");
                    break;
                case 2:
                    System.out.print("Введите имя: ");
                    String removeName = scanner.nextLine();
                    phonebook.removeContact(removeName);
                    System.out.println("Контакт удален.");
                    break;
                case 3:
                    System.out.print("Введите имя: ");
                    String searchName = scanner.nextLine();
                    phonebook.searchContact(searchName);
                    break;
                case 4:
                    phonebook.printAllContacts();
                    break;
                case 5:
                    System.out.println("Выход из справочника...");
                    System.exit(0);
                default:
                    System.out.println("Неверно введены данные. Попробуйте еще раз");
            }

            System.out.println();
        }
    }
}

