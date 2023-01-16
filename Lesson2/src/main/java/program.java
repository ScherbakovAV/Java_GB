import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Timer;

public class program {
    public static void main(String[] args) {
        str_vs_strbuilder();
    }
    public static void str_vs_strbuilder() {
        System.out.println("Start at " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH.mm.ss.nn")));
        String str = "";
        for (int i = 0; i < 1_000_000; i++) {
            str += "+";
        }
        System.out.println("Done STR at " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH.mm.ss.nn")));

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1_000_000; i++) {
            sb.append("+");
        }
        System.out.println("Done StringBuilder at " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH.mm.ss.nn")));
    }
}