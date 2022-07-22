package cn.simplelife.work._01_arraycopy;

public class ArraySortTest {
    public static void main(String[] args) {
        int[] arr = {1, 52, 23, 24, 5, 25};
        ArrayUtils.bubbleSort(arr);
        System.out.println(ArrayUtils.binarySearch(arr, 1));
    }
}
