package cn.simplelife.work._02implements;

import cn.simplelife.work._01interface.ISwimable;
import cn.simplelife.work._01interface.IWorkable;

/**
 * 测试多态类
 */
public class Test {
    public static void main(String[] args) {
        Frog frog = new Frog();
        //1、创建一个对象，赋值给ISwimable
        //2、frog实现了ISwimable接口所以可以调用里面的方法
        ISwimable iSwimable = frog;
        IWorkable iWorkable = frog;
        iSwimable.swing();
        iWorkable.walk();
        //duck也实现了接口所以可以调用接口中的方法
        iWorkable = new Duck();
        iWorkable.walk();
    }
}
