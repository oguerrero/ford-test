package src;

import java.util.LinkedHashMap;
import java.util.Map;

public class NumbersMapping {

    // LinkedHashMap to maintain the order of the Roman numerals
    public static final Map<String, Integer> ROMAN_TO_INT = new LinkedHashMap<String, Integer>() {
        {
            put("M", 1000);
            put("CM", 900);
            put("D", 500);
            put("CD", 400);
            put("C", 100);
            put("XC", 90);
            put("L", 50);
            put("XL", 40);
            put("X", 10);
            put("IX", 9);
            put("V", 5);
            put("IV", 4);
            put("I", 1);
        }
    };
}
