package filter;

import java.util.List;
import java.util.stream.Collectors;

public class TestFilter {

    static void main() {

        List<Integer> list = List.of(2,3,5,4,6);
        List<Integer> testFilter =
                list.stream().filter(l->l%2 == 0)
                        .map(m -> m*2)
                        .toList();

        testFilter.forEach(e -> System.out.print( " "+e));
    }
}
