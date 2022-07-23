package cn.simplelife.work._01_arraycopy;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] source = {1, 2, 3, 4, 5};
        int[] target = {0, 0, 0, 0, 0, 0, 0, 0};
        ArrayUtils.arrayCopy(source, target, 1, 2);
    }
}
