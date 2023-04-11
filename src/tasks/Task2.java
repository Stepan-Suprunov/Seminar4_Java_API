// Реализовать консольное приложение, которое: Принимает от пользователя и “запоминает” строки.
//  Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
//  Если введено revert, удаляет предыдущую введенную строку из памяти.

package tasks;

import java.util.*;

public class Task2 {
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        Deque<String> texts = new ArrayDeque<>();
        while (true) {
            System.out.print("\n Input, please, \n[text] for add text to list, \nprint for reverse print texts"
                    + "\nrevert for remove last inputed string\nor exit for end\n\t ->");
            String stg = scanner.nextLine();
            if (stg.equalsIgnoreCase("print")) {
                System.out.println(texts);
            } else if (stg.equalsIgnoreCase("revert")) {
                System.out.println("Удаляем -> " + texts.pop());
            } else {
                texts.push(stg);
            }
            if (stg.equals("exit")) {
                System.out.println("EXIT!!!");
                break;
            }
        }
        System.out.println(texts);
    }
}
