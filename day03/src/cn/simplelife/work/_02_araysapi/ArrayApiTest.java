package cn.simplelife.work._02_araysapi;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.util.Arrays;

public class ArrayApiTest {
    public static void main(String[] args) {
        int[] arr = {1, 52, 23, 24, 5, 25};
        int[] arr1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        // 1、数组转字符串
        System.out.println(Arrays.toString(arr));
        System.out.println("--------------------------");
        // 2、拷贝数组
        System.arraycopy(arr, 2, arr1, 3, 2);
        System.out.println(Arrays.toString(arr1));
        System.out.println("--------------------------");
        // 3、排序
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("--------------------------");
        //4、二分查找
        System.out.println(Arrays.binarySearch(arr, 1));
    }
}
