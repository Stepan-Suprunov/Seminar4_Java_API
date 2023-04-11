import tasks.*;

public class Main {
    public static void main(String[] args) {
        Task0.getTime();
        Task1.run();
        Task2.run();
        Task3.run();
        Task4 superstack = new Task4();
        superstack.push(123);
        superstack.push(234);
        superstack.push(345);
        superstack.push(456);
        superstack.push(567);
        for (int i = 0; i < superstack.getCapacity() - 1; i++) {
            System.out.println(superstack.pop());
        }
    }
}