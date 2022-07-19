package cn.simplelife.homework._01_statichomework;

public class StaticDemo {
    public static void main(String[] args) {
        /**
         * 此处不能new对象，因为静态工具类的构造器被私有化，不能被外部访问
         */
        //StaticArrayUtils staticArrayUtils = new StaticArrayUtils();
        int[][][] arr = {{{1, 2, 3}}, {{4, 5, 6}}};
        StaticArrayUtils.getItemInArray(arr);
    }
}
