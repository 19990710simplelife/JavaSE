package cn.simplelife.work._01_arraycopy;

import java.util.Arrays;
import java.util.Random;

public class ArrayUtils {

    /**
     * 从指定源数组中拷贝指定数量的元素到目标数组
     *
     * @param source 原数组
     * @param target 目标数组
     * @param offset 指定位置
     * @param num    拷贝个数
     */
    public static void arrayCopy(int[] source, int[] target, int offset, int num) {
        //1、编写循环语句，从0~num次
        for (int i = 0; i < num; i++) {
            if ((offset + i) > target.length) {
                return;
            }
            target[num + i] = source[offset + i];
        }
        System.out.println(Arrays.toString(target));
        //2、判断offset+index 是否会超出目标数组的索引边界，如果超出就结束拷贝
        //3、以当前索引从source中取出元素，存入offset+index
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
                    swap(arr, j, j + 1);
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 交互相邻的值
     *
     * @param arr 数组
     * @param i   索引
     * @param i1  索引+1
     */
    private static void swap(int[] arr, int i, int i1) {
        int temp = 0;
        temp = arr[i];
        arr[i] = arr[i1];
        arr[i1] = temp;
    }

    /**
     * 二分法查找目标值的索引
     *
     * @param arr    数组
     * @param target 目标值
     * @return 返回目标值的索引
     */
    public static int binarySearch(int[] arr, int target) {
        /**
         * 先对数据进行排序
         */
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

        int low = 0;//索引最小值
        int high = arr.length - 1;//索引最大值
        while (low <= high) {
            //计算中间索引
            int mid = (low + high) / 2 + 1;
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
