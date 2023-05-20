package main;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DecimalSplitter {

    private static final List<Integer> divisorNumbers = Arrays.asList(1000, 100, 10, 1);

    public static List<Integer> splitNumbers(int inp) {
        List<Integer> list = new ArrayList<>();
        for (int divisor : divisorNumbers) {
            list.add(inp - (inp % divisor));
            inp = inp % divisor;
        }
        return list;
    }

}