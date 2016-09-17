package org.matt.sandbox;

/**
 * Created by matt on 20/04/16.
 */
public class WordNumberPrinter implements NumberPrinter {

    private static final String [] WORDS = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};


    private static final String [] TENS = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
    private static final String HUNDRED = " hundred";
    private static final String THOUSAND = " thousand";


    private String print(int number, String[] words, String word, String spacer, int denominator) throws NumberPrinterException {
        int quotient = number / denominator;
        int remainder = number % denominator;
        return words[quotient] + word + (remainder == 0 ? "" : (spacer + print(remainder)));
    }


    private String print(int number, String word, String spacer, int denominator) throws NumberPrinterException {
        int quotient = number / denominator;
        int remainder = number % denominator;
        return print(quotient) + word + (remainder == 0 ? "" : (spacer + print(remainder)));
    }

    public String print(int number) throws NumberPrinterException {
        if (number < 0 ) {
            throw new NumberPrinterException("negative numbers not supported");
        }
        if (number < 20) {
            return WORDS[number];
        }
        if (number < 100) {
            return print(number, TENS, "", "-", 10);
        }
        if (number < 1000) {
            return print(number, HUNDRED, " ", 100);
        }
        if (number < 1000000) {
            return print(number, THOUSAND, " ", 1000);
        }

        throw new NumberPrinterException("number " + number + " is out of range 0-100000");
    }

    @Override
    public int getMinNumber() {
        return 0;
    }

    @Override
    public int getMaxNumber() {
        return 999999;
    }
}
