package seminars.HW;

import java.util.Scanner;

public class task3 {
    //3) Реализовать простой калькулятор
    public static void main(String[] args) {
        Scanner inputRead = new Scanner(System.in); 
        System.out.print("Введите два числа: ");
        double a = inputRead.nextDouble();
        double b = inputRead.nextDouble();
        double ans = 0;
        System.out.print("\nВыберите действие (+, -, *, /): ");
        char op = inputRead.next().charAt(0);
        if (op == '+'){
            ans = a + b;
            
        }
        else if ( op == '-'){
            ans = a - b;
        }
        else if ( op == '*'){
            ans = a * b;
        }
        else if ( op == '/'){
            ans = a / b;
        }
        else {
            System.out.print("Неверно введены данные.");
            return;
        }
        System.out.println(ans);
}
}