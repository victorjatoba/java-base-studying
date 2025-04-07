import java.util.List;
import java.util.ArrayList;

public class HeapAllocation {

    public static void main(String[] args) {
        List<Car> objects = new ArrayList<>();

        System.out.println("Start");
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        for(int i = 0; i < 10000000; i++) {
            objects.add(new Car("Peogeot 2008", "2021"));
        }

        System.out.println("end");
    }
}
