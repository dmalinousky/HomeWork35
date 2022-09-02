import java.util.Arrays;
import java.util.stream.Collectors;

public class Thread3 extends Thread {

    @Override
    public void run() {
        System.out.print("The sum: ");
        System.out.print(Arrays.stream(HW35MainClass.array).collect(Collectors.summingInt(x  -> x.intValue())));
    }
}
