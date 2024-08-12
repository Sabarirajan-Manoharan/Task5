package Task5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveEmpty {

    public static void main(String[] args) {

        List<String> ls = Arrays.asList("abc", "",
                "bc", "'efg", "abcd","", "jkl");

        List<String> lis = ls.stream().filter(s->s.length()>0).collect(Collectors.toList());

        System.out.println(lis);
    }
}
