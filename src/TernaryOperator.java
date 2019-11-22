import java.time.LocalDateTime;
import java.time.LocalTime;

public class TernaryOperator {
    public static void main(String[] args) {
        int ora = LocalDateTime.now().getHour();
        int minute = LocalDateTime.now().getMinute();

        String perioada = ora >= 12 ? "pm" : "an";


        System.out.println(ora + ":" + minute);
        System.out.println(perioada);

        for (int i=5; i>=0; i--) {
            System.out.println(i);

        }
    }
}
