package seminars.HW;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Logger;

public class task3 {
    //3) Реализовать простой калькулятор
    public static void main(String[] args) throws IOException{
        Logger logger1 = Logger.getAnonymousLogger(null);
        FileWriter fileWriter = new FileWriter("test.txt"); //создание текстовго файла
        //String happy = "Всем привет!";
        //String answer = String.valueOf(ans);
        //logger1.info(ans);
        //fileWriter.write(ans);
        
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
        String answer = String.valueOf(ans);
        logger1.info(answer);
        fileWriter.write(answer);
        fileWriter.close();
}
}