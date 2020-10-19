package com.doublerobot;

import java.util.EventListener;
import java.util.StringTokenizer;

/**
 * Simple Calculator for demonstration purposes.
 */
public class Calculator {

    private double state;

    /**
     *
     * @param value to add to register
     * @return the original Calculator object
     */
    public Calculator add(double value) {
        state += value;
        return this;
    }

    /**
     *
     * @param value to subtract from the register
     * @return the original Calculator object
     */
    public Calculator subtract(double value) {
        state -= value;
        return this;
    }

    /**
     *
     * @param value to multiply the register by
     * @return the original Calculator object
     */
    public Calculator multiply(double value) {
        state = state * value;
        return this;
    }

    /**
     *
     * @param value to divide the register by
     * @return the original Calculator object
     */
    public Calculator divide(double value) {
        state = state / value;
        return this;
    }

    /**
     *
     * @return current value of the register
     */
    public double value() {
        return state;
    }

    /**
     *
     * @param value to apply transwarp value
     * @return the original Calculator object
     */
    public Calculator transwarp(double value) {

        // TODO figure out the transwarp requirements.
        throw new UnsupportedOperationException("No transwarp defined.");
    }

    /**
     *
     * Method intended to trip the PMD violations error. Hopefully you find this method as horrifying as I do even without PMD.
     *
     * @param foo random string
     * @param bar random string
     * @param spam untyped Object FTW
     * @param eventListener some kind of events...?
     * @param stringTokenizer because why not?
     * @return some number
     */
    public int arbitrarilyComplexMethod(String foo, int bar, Object spam, EventListener eventListener, StringTokenizer stringTokenizer) {

        try {
            System.out.println(foo);
        } catch (Exception e) {

        }

        try {
            System.out.println(foo);
        } catch (Exception e) {

        }


        if (foo == "bar")
            return 0;

        if (bar++ == -100)
            return Long.BYTES;

        return Integer.valueOf(foo + bar + spam.toString() + eventListener.toString() + stringTokenizer.toString());
    }

    /**
     * Method intended to trip the CPM violations error
     *
     * @param foo random string
     * @param bar random string
     * @param spam untyped Object FTW
     * @param eventListener some kind of events...?
     * @param stringTokenizer because why not?
     * @return some number
     */
    public int arbitrarilyComplexMethodPart2(String foo, int bar, Object spam, EventListener eventListener, StringTokenizer stringTokenizer) {
        try {
            System.out.println(foo);
        } catch (Exception e) {

        }

        try {
            System.out.println(foo);
        } catch (Exception e) {

        }

        if (foo == "bar")
            return 0;

        if (bar++ == -100)
            return Long.BYTES;

        return Integer.valueOf(foo + bar + spam.toString() + eventListener.toString() + stringTokenizer.toString());
    }

}
