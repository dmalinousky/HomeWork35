import java.util.Arrays;

public class Thread1 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < HW35MainClass.array.length; i++) {
            int random = (int) (Math.random() * 10);
            HW35MainClass.array[i] = random;
        }
        System.out.println("Mass is fulfilled!");
        System.out.println(Arrays.toString(HW35MainClass.array));
    }
}
