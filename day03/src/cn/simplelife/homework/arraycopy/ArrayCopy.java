package cn.simplelife.homework.arraycopy;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] source = {8, 1, 7, 3, 2, 5};
        int[] target = {0, 0, 0, 0, 0, 0, 0, 0};
        ArrayUtils.arrayCopy(source, target, 1, 2, 3);
        System.arraycopy(source, 1, target, 2, 3);
        System.out.println(Arrays.toString(target));
        System.out.println("--------------------------------");
        ArrayUtils.bubbleSort(source);
        Arrays.sort(source);
        System.out.println("source = " + Arrays.toString(source));
        System.out.println(ArrayUtils.binarySearch(source, 3));
    }
}
