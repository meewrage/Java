package seminars.HW;

import java.util.*;
import java.util.function.Supplier;

public class task5 {
    //Пусть дан произвольный список целых чисел.
    //1) Нужно удалить из него чётные числа
    //2) Найти минимальное значение
    //3) Найти максимальное значение
    //4) Найти среднее значение
    public static void main(String[] args){
    List<Integer> list = new ArrayList(Arrays.asList(6, 23, 19, 11, 1, 3, 47, 25, 17));
    System.out.println(list);
    delete(list);
    MaxNum(list);
    System.out.println(MaxNum(list));
    MinNum(list);
    System.out.println(MinNum(list));
    average(list);
    System.out.println(average(list));

    }


public static void delete(List<Integer> arrList){
    for (int i=0; i < arrList.size()-1; i++) {
            if (arrList.get(i) % 2 == 0) {
                arrList.remove(i);
            }
        } 
        System.out.println("Остаток после удаления чётных: " + arrList);
        
    }

     static Integer MaxNum(List<Integer> arrList) {
        int max = arrList.get(0); 
        for (int i=0; i < arrList.size()-1; i++) {
            if (arrList.get(i) > max) {
                max = arrList.get(i);
            }
        } 
        return max;
    }

     static Integer MinNum(List<Integer> arrList) {
        int min = arrList.get(0); 
        for (int i=0; i < arrList.size()-1; i++) {
            if (arrList.get(i) < min) {
                min = arrList.get(i);
            }
        } 
        return min;
    }

     static Double average(List<Integer> arrList) {
        int sum = 0; 
        double average;
        for (int i=0; i < arrList.size()-1; i++) {
            sum += arrList.get(i);
        } 
        average = sum / arrList.size();
        return average;
    }
    
}