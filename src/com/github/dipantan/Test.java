package com.github.dipantan;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        String s = Input.String("Enter string: ");
        Integer i = Input.Int("Enter in: ");
        Float f = Input.Float("Enter float: ");
        Character c = Input.Char("Enter char: ");
        System.out.println("String: " + s + "\nInt: " + i + "\nFloat: " + f + "\nCharacter: " + c);
    }
}
