package ru.job4j.array;

public class SwitchArray {

    public static int[] swapBorder(int[] array) {
        int temp = array[0];
        int length = array.length - 1;
        array[0] = array[length];
        array[length] = temp;
        return array;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1, 2, 3, 4, 5, 6};
        int[] rsl = swapBorder(nums);
        for (int i : rsl) {
            System.out.println(i);
        }
    }
}