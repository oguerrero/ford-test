package src;

import java.util.Map;

public class ToRoman {

    public static String convert(int n) {
        StringBuilder result = new StringBuilder();

        for (Map.Entry<String, Integer> entry : NumbersMapping.ROMAN_TO_INT.entrySet()) {
            while (n >= entry.getValue()) {
                result.append(entry.getKey());
                n -= entry.getValue();
            }
        }

        return result.toString();
    }
}
