import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NonEmptyStringsList {
    public static void main(String[] args) {
        // Create a list of strings
        List<String> listStrings = Arrays.asList("abc", " ", "bc", "abcd", "efg", "", "jkl");

        // Use Stream API and lambda expression to filter non-empty strings
        List<String> nonEmptyStrings = listStrings.stream()
                .filter(str -> !str.trim().isEmpty())
                .collect(Collectors.toList());

        // Display the list containing non-empty strings
        System.out.println("List of non-empty strings:");
        nonEmptyStrings.forEach(System.out::println);
    }
}