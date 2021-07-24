package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int nullPoint = index;
                for (int notNull = index; notNull < array.length; notNull++) {
                    if (array[notNull] != null) {
                        String temp = array[notNull];
                        array[notNull] = array[nullPoint];
                        array[nullPoint] = temp;
                        nullPoint++;
                    }
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, null, "wanna", null, "be", null, "compressed"};
        String[] compress = compress(input);
        System.out.println();
        for (int index = 0; index < compress.length; index++) {
            System.out.print(compress[index] + " ");
        }
    }
}
