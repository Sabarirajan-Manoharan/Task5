package Task5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StudentWithA {

    public static void main(String[] args) {

        List<String> lss = Arrays.asList("Guru",
                "Kicha",
                "Dhanush",
                "Ajay",
                "Rajini",
                "Kamal",
                "Vijay",
                "Ajith",
                "Surya",
                "Vikram");

        lss = lss.stream()
                .filter(s->s.charAt(0)=='A')
                .collect(Collectors.toList());

        System.out.println(lss);

    }
}
