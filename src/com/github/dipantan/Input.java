package com.github.dipantan;

import org.jetbrains.annotations.NotNull;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * This class is used to take input from console using buffredreader. It is inspired by
 * python input() function. All the methoda are static, so you don't have to create any
 * object of this class.
 */

public class Input {

    /*
     * Method that takes string and returns string
     * You can optionally pass your string message as parameter
     * which will promt during input
     * */
    public static String String(String s) throws IOException {
        System.out.println(s);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
    }

    /*
     * Method that takes string and returns string
     * It takes no parameters
     * */
    public static String String() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
    }

    /*
     * Method that takes integer and returns integer
     * You can optionally pass your string message as parameter
     * which will promt during input
     * */
    @NotNull
    public static Integer Int(String s) throws IOException {
        System.out.println(s);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return Integer.valueOf(br.readLine());
    }

    /*
     * Method that takes integer and returns integer
     * It takes no parameters
     * */
    @NotNull
    public static Integer Int() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return Integer.valueOf(br.readLine());
    }

    /*
     * Method that takes float and returns float
     * You can optionally pass your string message as parameter
     * which will promt during input
     * */
    @NotNull
    public static Float Float(String s) throws IOException {
        System.out.println(s);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return Float.valueOf(br.readLine());
    }

    /*
     * Method that takes float and returns float
     * It takes no parameters
     * */
    @NotNull
    public static Float Float() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return Float.valueOf(br.readLine());
    }

    /*
     * Method that takes char and returns char
     * You can optionally pass your string message as parameter
     * which will promt during input
     * */
    @NotNull
    public static Character Char(String s) throws IOException {
        System.out.println(s);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return (char) br.read();
    }

    /*
     * Method that takes char and returns char
     * It takes no parameters
     * */
    @NotNull
    public static Character Char() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return (char) br.read();
    }
}
