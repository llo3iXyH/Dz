import java.time.LocalDateTime;
import java.time.Month;

public class Constr {
    public static void main(String[] args) {
        LocalDateTime opened = LocalDateTime.of(2025, Month.FEBRUARY, 4, 7, 28, 10);
        Par account = new Par(opened, "Kot", "Tok", 26, 78.2, 195);
        LocalDateTime opened1 = LocalDateTime.of(2023, Month.JANUARY, 23, 20, 55, 12);
        Par account1 = new Par(opened1, "Kot", "Tok", 32, 65, 175);

        System.out.println(account);

        System.out.println(account1);
    }
}