package cn.simplelife.homework._09_game02;

import java.util.Scanner;

public class Player {
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

    //用户输入玩家名字的方法
    public void giveName() {
        System.out.println("请输入你的名字：");
        name = input.next();
    }

    //用户猜拳方法
    public void guess() {
        System.out.print("请出拳：\t1.剪刀\t2.石头\t3.布（输入相应数字）：");
        int jishu = 0;
        boolean panduan = true;
        do {
            try {
                do {
                    jishu = input.nextInt();
                    if (jishu > 0 && jishu < 4) {
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
        if (jishu == 1) {
            setChuquan("剪刀");
        } else if (jishu == 2) {
            setChuquan("石头");
        } else if (jishu == 3) {
            setChuquan("布");
        }
    }
}
