package seminars.HW;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Logger;

public class task4 {
     //Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
    public static void main(String[] args) throws IOException{
        Logger logger1 = Logger.getAnonymousLogger(null);
        FileWriter fileWriter = new FileWriter("test.txt");
        int[] arr = {2,10,11,5,7,8,-2}; 
        for (int i = 0; i < arr.length; i++ )
            System.out.println(arr[i]);     
        logger1.info("Исходнный массив: " + Arrays.toString(arr));
        fileWriter.write(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.printf("Отсортированный массив: "+ Arrays.toString(arr));
        fileWriter.write(Arrays.toString(arr));
        fileWriter.close();

}
    public static void bubbleSort(int[]arr) throws IOException {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i -1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    
                }   
                
            }
        logger1.info("Промежуточные итерации: " + (i+1) + Arrays.toString(arr));    
        }
        //return arr;
                
    }
            

}