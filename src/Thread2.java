import java.util.Arrays;

public class Thread2 extends Thread {

    @Override
    public void run() {
        System.out.print("Average value: ");
        System.out.print(((double) (Arrays.stream(HW35MainClass.array).reduce((x, y) -> x + y).get())
                / (double) (HW35MainClass.array.length)));
        System.out.println();
    }
}
