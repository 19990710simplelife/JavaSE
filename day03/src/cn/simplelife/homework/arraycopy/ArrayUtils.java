package cn.simplelife.homework.arraycopy;

import java.util.Arrays;

public class ArrayUtils {

    /**
     * 拷贝数组元素
     *
     * @param source 源数组
     * @param target 目标数组
     * @param Sindex 原数组索引开始位置
     * @param Tindex 目标数组索引开始位置
     * @param length 拷贝长度
     */
    public static void arrayCopy(int[] source, int[] target, int Sindex, int Tindex, int length) {
        for (int i = 0; i < length; i++) {
            if ((Tindex + length) > target.length) {
                return;
            }
            target[Tindex + i] = source[Sindex + i];
        }
        System.out.println(Arrays.toString(target));
    }

    /**
     * 冒泡排序
     *
     * @param arr 数组
     */
    public static void bubbleSort(int[] arr) {
        for (int i = 1; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = 0;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }


    /**
     * 二分查找
     *
     * @param arr 查找数组
     * @param target 目标值
     * @return 返回目标值的索引
     */
    public static int binarySearch(int[] arr, int target) {
        int low = 0;//索引最小值
        int high = arr.length - 1;//索引最大值
        while (low <= high) {
            //计算中间索引
            int mid = (low + high) / 2;
            int midValue = arr[mid];
            if (midValue < target) {
                low = mid + 1;
            } else if (midValue > target) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
