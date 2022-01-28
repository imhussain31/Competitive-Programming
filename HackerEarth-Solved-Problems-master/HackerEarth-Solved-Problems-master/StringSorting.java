import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringSorting {
    public static void main (String[] args)
    {
        String sorted = Stream.of("edcba".split("")).sorted().collect(Collectors.joining());
        System.out.println(sorted);
    }
}
