package by.trubetski.springmvc;

import java.util.Arrays;

import static java.lang.System.out;

public class Utils {
    public static void printAllStrings(String... str) {
        Arrays.stream(str)
                .forEach(s -> {
                    boolean isPositive = StringUtils.isPositiveNumber(s);
                    out.println("String: " + s + ", isPositiveNumber: " + isPositive);
                });
    }
}
