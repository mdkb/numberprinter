package org.matt.sandbox.rest;

/**
 * Created by matt on 04/09/16.
 */
public class Range {
    final int min;
    final int max;


    public Range(int min, int max) {

        this.min = min;
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

}
