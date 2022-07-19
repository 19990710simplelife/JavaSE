package cn.simplelife.homework._09_game02;

import java.util.Random;
import java.util.Scanner;

public class Computer {
    Scanner input = new Scanner(System.in);
    private String name;
    private int count;
    private String chuquan;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getChuquan() {
        return chuquan;
    }

    public void setChuquan(String chuquan) {
        this.chuquan = chuquan;
    }

    //获得名字方法
    public void giveName() {
        System.out.print("请选择对方角色（1.刘备  2.孙权  3.曹操）");
        int name = 0;
        boolean panduan = true;
        do {
            try {
                do {
                    name = input.nextInt();
                    if (name > 0 && name < 4) {
                        panduan = false;
                    } else {
                        System.err.println("输入错误，请输入1-3之间的整数：");
                    }
                } while (panduan == true);
            } catch (Exception e) {
                System.err.println("输入错误，请输入1-3之间的整数：");
                input.next();
            }
        } while (panduan == true);
        if (name == 1) {
            this.name = "刘备";
        } else if (name == 2) {
            this.name = "孙权";
        } else {
            this.name = "曹操";
        }
    }

    //电脑随机获得数字的猜拳方法
    public void guess() {
        Random random1 = new Random();
        int jishu = random1.nextInt(3);
        if (jishu == 1) {
            chuquan = "剪刀";
        } else if (jishu == 2) {
            chuquan = "石头";
        } else {
            chuquan = "布";
        }
    }
}
