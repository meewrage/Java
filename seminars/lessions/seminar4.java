package seminars.lessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class seminar4 {
    public static void main(String[] args){
        long startTime = System.nanoTime();
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            arrayList.add(i);
            
        }
        long endtime = System.nanoTime();
        long resultArrayList = endtime - startTime;

        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 10000; i++) {
            linkedList.add(i);
            
        }
        endtime = System.nanoTime();
        long resultLinledList = endtime - startTime;
        System.out.println(resultLinledList);
        System.out.println(resultArrayList);
        
    }
}
