// Замерьте время, за которое в ArrayList добавятся 10000000 элементов.
// Замерьте время, за которое в LinkedList добавятся 10000000 элементов. Сравните с предыдущим.

package tasks;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task0 {
    public static int LENGTH = 10000000;

    public static void getTime() {
        List<Integer> intArrayList = new ArrayList<>();
        List<Integer> intLinkedList = new LinkedList<>();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < LENGTH; i++) {
            intArrayList.add(i);
        }
        long endTime = System.currentTimeMillis();
        double result = (endTime - startTime);
        System.out.printf("Run time for ArrayList: %s %s %n", result, "ms");
        long startTime2 = System.currentTimeMillis();
        for (int i = 0; i < LENGTH; i++) {
            intLinkedList.add(i);
        }
        long endTime2 = System.currentTimeMillis();
        double result2 = (endTime2 - startTime2);
        System.out.printf("Run time for LinkedList: %s %s %n", result2, "ms");
    }

}
