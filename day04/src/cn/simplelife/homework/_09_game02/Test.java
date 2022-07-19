package cn.simplelife.homework._09_game02;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("********************************");
        System.out.println("************猜拳, 开始************");
        System.out.println("********************************");
        System.out.println("出拳规则：\t1.剪刀\t2.石头\t3.布");
        //调用Game类
        Game g = new Game();
        g.start();
        System.out.println();
        System.out.println("要开始吗？(输入y继续，输入其他结束)");
        String panduan = input.next();
        //循环game方法
        while(panduan.equals("y")){
            System.out.println("********************************");
            g.game();
            System.out.println("是否开始下一局(输入y继续，输入其他结束) : ");
            panduan = input.next();
        }
        System.out.println("游戏结束");
        g.versult();
    }
}
