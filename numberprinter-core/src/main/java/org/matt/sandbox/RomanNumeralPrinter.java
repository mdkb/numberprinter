package org.matt.sandbox;

import org.apache.commons.lang.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by matt on 21/04/16.
 */
public class RomanNumeralPrinter implements NumberPrinter {

    static final private Map<Integer, String> map = new HashMap<Integer, String>();
    static {
        map.put(1,"I");
        map.put(5, "V");
        map.put(10, "X");
        map.put(50, "L");
        map.put(100, "C");
        map.put(500, "D");
        map.put(1000, "M");
    }

    private String  print(int number, int factor) throws Exception {
        int one = 1 * factor;
        int four = 4 * factor;
        int five = 5 * factor;
        int nine = 9 * factor;
        int ten = 10 * factor;
        int quotient = number / factor;
        int remainder = number % factor;

        if (number < four) {
            return StringUtils.repeat(map.get(factor), quotient) + printIfNotZero(remainder);
        }
        if (number < five) {
            return print(one) + print(five) + printIfNotZero(remainder);
        }
        if (number < nine) {
            return print(five) + print(number - five);
        }
        if (number < ten) {
            return print(one) + print(ten) +  printIfNotZero(remainder);
        }

        throw new Exception("out of range");
    }



    public String print(int number) throws Exception {
        if (number < 1) {
            throw new Exception("out of range");
        }

        if (map.containsKey(number)) {
            return map.get(number);
        }


        if (number < 10) {
            return print(number, 1);
        }

        if (number < 100) {
            return print(number, 10);
        }

        if (number < 1000) {
            return print(number, 100);
        }

        if (number < 4000) {
            return print(number, 1000);
        }
        throw new Exception("out of range");

    }

    private String printIfNotZero(int number) throws Exception {
        if (number == 0) {
            return "";
        }
        return print(number);
    }
}
