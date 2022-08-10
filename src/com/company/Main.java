package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Class class1 = new Class(12, "word", 12,23,44,565);
        System.out.println("int number = "+class1.getNumber()+", " +"String word = "+class1.getWord()+", "+"int[] array = "+Arrays.toString(class1.getArray()));





    }
}
