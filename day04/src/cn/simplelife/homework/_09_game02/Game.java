package cn.simplelife.homework._09_game02;

public class Game {
    //初始化玩家类和电脑类
    Player p = new Player();
    Computer c = new Computer();

    //游戏开始
    public void start() {
        c.giveName();
        p.giveName();
        System.out.println(p.getName() + " VS " + c.getName());
    }

    //判断每次猜拳的结果
    public void game() {
        p.guess();
        c.guess();
        System.out.println("你出拳：" + p.getChuquan());
        System.out.println(c.getName() + "出拳：" + c.getChuquan());
        if ((p.getChuquan().equals("剪刀") && c.getChuquan().equals("布")) || (p.getChuquan().equals("石头") && c.getChuquan().equals("剪刀")) || (p.getChuquan().equals("布") && c.getChuquan().equals("石头"))) {
            p.setCount(p.getCount() + 1);
            System.out.println("哇，你赢了，好厉害！");
        } else if ((c.getChuquan().equals("剪刀") && p.getChuquan().equals("布")) || (c.getChuquan().equals("石头") && p.getChuquan().equals("剪刀")) || (c.getChuquan().equals("布") && p.getChuquan().equals("石头"))) {
            c.setCount(c.getCount() + 1);
            System.out.println("对不起，你输了！");
        } else if (c.getChuquan().equals(p.getChuquan())) {
            System.out.println("平局！");
        }
    }

    //输出最终结果
    public void versult() {
        System.out.println(p.getName() + " VS " + c.getName());
        System.out.println(p.getName() + "赢了" + p.getCount() + "局");
        System.out.println("电脑赢了" + c.getCount() + "局");
        if (p.getCount() > c.getCount()) {
            System.out.println("最终对战结果：" + p.getName() + "赢了");
        } else if (p.getCount() < c.getCount()) {
            System.out.println("最终对战结果：电脑赢了");
        } else if (p.getCount() == c.getCount()) {
            System.out.println("最终对战结果：平局");
        }
    }
}
