package seminars.HW;
//Вывести все простые числа от 1 до 1000
public class task2 {
    public static void main(String[] args) {
        int n = 1000;
        nextPrime:
       for (int i = 1; i <= n; i++) {
            for (int k = 2; k < i; k++){
                if (i % k == 0) continue nextPrime;
                }
                
                System.out.println(i);
                
                }
                

            }  

}
