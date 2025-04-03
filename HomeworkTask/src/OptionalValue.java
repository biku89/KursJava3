import java.util.Optional;

public class OptionalValue {
    public static void main(String[] args) {
        Optional<Integer> value = Optional.of(15);

        Double result = value.map(Math::sqrt)
                .orElseThrow(() -> new IllegalArgumentException("warrtść null"));

        System.out.println(result);

    }
}
