package org.matt.sandbox.rest;


import org.matt.sandbox.NumberPrinter;
import org.matt.sandbox.RomanNumeralPrinter;
import org.matt.sandbox.WordNumberPrinter;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumberPrinterController {

    // TODO better handle exception
    @RequestMapping("/printnumber/roman/{number}")
    public @ResponseBody PrintedNumber  printRomanNumber(@PathVariable("number") int number) throws Exception {
        NumberPrinter printer = new RomanNumeralPrinter();
        return new PrintedNumber(number, printer.print(number));
    }

    // TODO better handle exception
    @RequestMapping("/printnumber/word/{number}")
    public @ResponseBody PrintedNumber printWordNumber(@PathVariable("number") int number) throws Exception {
        NumberPrinter printer = new WordNumberPrinter();
        return new PrintedNumber(number, printer.print(number));
    }
}
