import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalEmail {
    public static void main(String[] args) {
        List<String> email = new ArrayList<>();
        email.add("tutajNieMaMalpy.com");
        email.add("TuJestMalpa@gmail.com");

        String result =
                email.stream()
                        .filter(mail -> mail.contains("@"))
                        .findAny()
                        .orElse("Brak@domena.com");

        System.out.println("Twój email " + result);
    }
}
