package cn.simplelife.homework._02_singletonhomework._03_enumsingletonhomework;

public class EnumSingletonTest {
    public static void main(String[] args) {
        int[][][] arr = {{{1, 2, 3}}, {{4, 5, 6}}};
        EnumSingleton singleton = EnumSingleton.SINGLETON;
        singleton.getItemInArray(arr);
    }
}

