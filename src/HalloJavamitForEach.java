import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class HalloJavamitForEach {

    public static void main(String[] args) {
        List<String> liste = new ArrayList<>();

        liste.add("Hallo");
        liste.add("foo");
        liste.add("test");
        liste.add("123");

        for(String s : liste) {
            System.out.println(s);
        }

        System.out.println("");

        liste.forEach((String s) -> System.out.println(s));

        Consumer<String> consumer = (String s) -> System.out.println(s);

        System.out.println("");

        liste.forEach(System.out::println);
    }
}
