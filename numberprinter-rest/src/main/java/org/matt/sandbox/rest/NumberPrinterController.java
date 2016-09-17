package org.matt.sandbox.rest;


import org.matt.sandbox.NumberPrinter;
import org.matt.sandbox.RomanNumeralPrinter;
import org.matt.sandbox.WordNumberPrinter;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class NumberPrinterController {

    static Map<String, NumberPrinter> map = new HashMap<>();
    static {
        map.put("roman", new RomanNumeralPrinter());
        map.put("word", new WordNumberPrinter());
    }


    @RequestMapping("/numberprinters")
    public @ResponseBody String[]  getPrinters()  {
        return map.keySet().toArray(new String[map.size()]);
    }


    @RequestMapping("/cf/range/{printer}")
    public @ResponseBody Range  getRange(@PathVariable("printer") String printer)  {
        NumberPrinter numberPrinter = map.get(printer);// TODO check result
        int min = numberPrinter.getMinNumber();
        int max = numberPrinter.getMaxNumber();

        return new Range(min, max);
    }

    // TODO better handle exception
    @RequestMapping("/printnumber/{printer}/{number}")
    public @ResponseBody PrintedNumber  printRomanNumber(@PathVariable("printer") String printer, @PathVariable("number") int number) throws Exception {
        NumberPrinter numberPrinter = map.get(printer);// TODO check result
        return new PrintedNumber(number, numberPrinter.print(number));
    }

}
