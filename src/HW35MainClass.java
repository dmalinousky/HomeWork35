import java.util.Arrays;

public class HW35MainClass {
    public static Integer[] array = new Integer[50];

    public static void main(String[] args) throws InterruptedException {
        // Fulfilling the array
        Thread1 thread1 = new Thread1();
        thread1.start();
        thread1.join();

        if (HW35MainClass.array[49] != null) {
            // Counting average
            Thread2 thread2 = new Thread2();
            thread2.start();
            thread2.join();

            // Counting the sum
            Thread3 thread3 = new Thread3();
            thread3.start();
            thread3.join();
        }
    }
}
