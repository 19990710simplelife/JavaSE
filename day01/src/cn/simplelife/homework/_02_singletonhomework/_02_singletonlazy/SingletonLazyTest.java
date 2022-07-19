package cn.simplelife.homework._02_singletonhomework._02_singletonlazy;

public class SingletonLazyTest {
    public static void main(String[] args) {
        int[][][] arr = {{{1, 2, 3}}, {{4, 5, 6}}};
        SingletonLazy singletonLazy = SingletonLazy.getSingletonLazy();
        SingletonLazy singletonLazy1 = SingletonLazy.getSingletonLazy();
        System.out.println(singletonLazy == singletonLazy1);
        singletonLazy.getItemInArray(arr);
    }
}
