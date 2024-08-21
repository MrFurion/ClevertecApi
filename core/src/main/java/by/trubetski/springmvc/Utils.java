package by.trubetski.springmvc;

import java.util.Arrays;

public class Utils {
    public static void printAllStrings(String... str) {
        Arrays.stream(str)
                .forEach(s -> {
                    boolean isPositive = StringUtils.isPositiveNumber(s);
                    System.out.println("String: " + s + ", isPositiveNumber: " + isPositive);
                });
    }
}
