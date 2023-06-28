package seminars.HW;

import java.util.Scanner;

//1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

public class task1 {
    public static void main(String[] args) {
        Scanner inputRead = new Scanner(System.in); 
        int n = inputRead.nextInt();
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        
        System.out.println(result);
        }

inputRead.close();    
}
}