package seminars.HW;
import java.util.*;

//Даны два Deque, представляющие два целых числа. Цифры хранятся в обратном порядке и каждый из их узлов содержит одну цифру.
//1) Умножьте два числа и верните произведение в виде связанного списка.
//2) Сложите два числа и верните сумму в виде связанного списка. Одно или два числа должны быть отрицательными.

public class task6 {
    
    public static void main(String[] args) {
        Deque<Integer> d1 = new ArrayDeque<>(Arrays.asList(3,2));;
        Deque<Integer> d2 = new ArrayDeque<>(Arrays.asList(8,5));
        //первое число
        String a = d1.getFirst().toString();
        String b = d1.getLast().toString();
        int firstNum = Integer.parseInt(b+a);
        //второе число
        String c = d2.getFirst().toString();
        String d = d2.getLast().toString();
        int secondNum = Integer.parseInt(d+c);

        //нахождение суммы
        int sum = firstNum + secondNum;
        int e = sum / 10;
        int f = sum % 10;
        Deque<Integer> d3 = new ArrayDeque<>();
        d3.add(e);
        d3.add(f);

        //умножение
        int multi = firstNum * secondNum;
        Deque<Integer> d4 = new ArrayDeque<>();
        while (multi!=0) {
           int multiF = multi % 10; 
            d4.add(multiF);
            multi = multi /10;
        }
    
        
        System.out.println(sum);
        System.out.println(d3);
        System.out.println(d4);
        
    }
}