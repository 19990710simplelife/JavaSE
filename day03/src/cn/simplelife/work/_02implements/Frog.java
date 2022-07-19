package cn.simplelife.work._02implements;

import cn.simplelife.work._01interface.ISwimable;
import cn.simplelife.work._01interface.IWorkable;

public class Frog extends Animal implements IWorkable, ISwimable {
    @Override
    public void swing() {
        System.out.println("游啊游");
    }

    @Override
    public void walk() {
        System.out.println("跳啊跳");
    }
}
