package cn.simplelife.work._02implements;

import cn.simplelife.work._01interface.IAmphibiable;
import cn.simplelife.work._01interface.ISwimable;
import cn.simplelife.work._01interface.IWorkable;

public class Duck implements IWorkable, ISwimable, IAmphibiable {

    @Override
    public void fly() {
        System.out.println("飞呀飞~~~");
    }

    @Override
    public void swing() {
        System.out.println("游呀呦~~~");
    }

    @Override
    public void walk() {
        System.out.println("走路吧~~~");
    }
}
