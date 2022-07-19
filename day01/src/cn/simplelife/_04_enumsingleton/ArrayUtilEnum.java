package cn.simplelife._04_enumsingleton;

public enum ArrayUtilEnum {
    ENUM_ARRAY_PRINT;

    /**
     * 打印数组的工具
     *
     * @param arr 一个int类型的数组
     */
    public void printArray(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("参数类型错误！");
        } else {
            String str = "[";
            for (int i = 0; i < arr.length; i++) {
                str += arr[i];
                if (i == arr.length - 1) {
                    str += "]";
                } else {
                    str += ",";
                }
            }
            System.out.println(str);
        }
    }
}
