package cn.simplelife.homework._02_singletonhomework._03_enumsingletonhomework;


public enum EnumSingleton {
    SINGLETON;

    /**
     * 提供一个静态遍历三维数组的方法，供外部使用
     *
     * @param arr 一个三维维数组
     */
    public void getItemInArray(int[][][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.print(arr[i][j][k]);
                }
            }
        }
    }
}
