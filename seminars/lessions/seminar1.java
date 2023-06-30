package seminars.lessions;
import java.time.LocalDateTime;
import java.util.Scanner;

public class seminar1 {
    public static void main(String[] args) {
        //System.out.println("Hello " + LocalDateTime.now());
        //Scanner inputRead = new Scanner(System.in); //метод для считывания и вывода числа инт
        //int a = inputRead.nextInt();
        //System.out.println(a);

        //Scanner iScanner = new Scanner(System.in); //метод для считывания строки и вывода ее
        //String name = iScanner.nextLine();
        //System.out.println("Привет, " + name);

        //int[] ints = {1,2,3,4,5,6,7,8,9,10}; //задать и вывести массив
        //for (int i = 0; i < ints.length; i++ )
            //System.out.println(ints[i]);

        //int[] nums = {3,2,2,3};
        //int val = 3;
        //for (int i = 1; i < nums.length; i++ );
            //for (int j = i; j < nums.length; j++ );{
                //if (nums[j - 1]== val){
                    //int tmp = nums[j - 1];
                    //nums[j - 1] = nums[j];
                    //nums[j] = tmp;

                //}

            //}
            //for (int i =0; i < nums.length; i++) {

            
            //System.out.print(nums[i] + ' ');
            //}

        //Метод, который находит самую длинную строку общего префикса среди массива строк. Если общего превикса нет, вернуть пустую строку "".
        String[] strings = {"flower", "flow", "flight", "apple", "flip"};
        String pref = "fl";
        int leng = 0;
        int count = 0;
        for (int i = 0; i < strings.length; i++) {
            if ( strings[i].startsWith(pref));{
                if ( strings[i].length() > leng) { 
                    leng = strings[i].length();
                    count = i;

                }
            }
        }
        System.out.println(strings[count]);

    }

}