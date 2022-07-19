package cn.simplelife.homework._08_game;

import java.util.Scanner;

public class Game {
    /**
     * 初始化游戏
     */
    public void initGame() {
        System.out.println("********************************************");
        System.out.println("*             欢迎来到猜拳大峡谷             *");
        System.out.println("********************************************");
        Scanner scanner = new Scanner(System.in);
        System.out.println("是否开始游戏？( Y/y:开始游戏  N/n:退出游戏 )");
        String start = scanner.next();
        if (start.equals("Y") || start.equals("y")) {
            //开始游戏，创建一个裁判对象
            Judge judge = new Judge();
            //开始游戏 选择电脑玩家
            ComputerPlayer computerPlayer = chooseComputer();
            //初始化用户玩家
            UserPlayer userPlayer = initUserGamePlayer();
            //输出玩家信息
            System.out.println(computerPlayer.getName() + " " + "------VS------" + " " + userPlayer.getName());
            //电脑玩家出拳
            computerPlayer.hand(computerPlayer);
            //用户玩家出牌
            userPlayer.hand(userPlayer);
            //调用裁判的比较方法
            judge.compare(computerPlayer.getType(), userPlayer.getType());
        }

        if (start.equals("N") || start.equals("n")) {
            System.out.println("欢迎下次再来玩哦！");
            System.exit(0);
        }
    }

    /**
     * 选择电脑玩家对象
     *
     * @return 返回一个电脑玩家对象
     */
    public ComputerPlayer chooseComputer() {
        Scanner scanner = new Scanner(System.in);
        ComputerPlayer computerPlayer = new ComputerPlayer();
        System.out.println("请选择您的对局选手:(1、刘备 2、张飞 3、关羽)");
        int choose = scanner.nextInt();
        if (choose == 1) {
            computerPlayer.setName("刘备");
        } else if (choose == 2) {
            computerPlayer.setName("张飞");
        } else if (choose == 3) {
            computerPlayer.setName("关羽");
        } else {
            System.out.println("输入错误！请重新输入！");
            chooseComputer();
        }
        return computerPlayer;
    }

    /**
     * 初始化游戏玩家
     *
     * @return 返回一个游戏玩家对象
     */
    public UserPlayer initUserGamePlayer() {
        Scanner scanner = new Scanner(System.in);
        UserPlayer userPlayer = new UserPlayer();
        System.out.print("请输入您的昵称:");
        String userPlayerName = scanner.next();
        //设置用户昵称
        userPlayer.setName(userPlayerName);
        System.out.print("请选择您的出拳:(1、石头 2、剪刀 3、布):");
        int userChooseHandType = scanner.nextInt();
        //设置用户出牌
        userPlayer.setType(userChooseHandType);
        return userPlayer;
    }
}
