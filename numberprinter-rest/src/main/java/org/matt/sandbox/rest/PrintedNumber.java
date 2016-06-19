package org.matt.sandbox.rest;

/**
 * Created by matt on 01/06/16.
 */
public class PrintedNumber {
    int number;
    String value;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public PrintedNumber(int number, String value) {

        this.number = number;
        this.value = value;
    }
}
