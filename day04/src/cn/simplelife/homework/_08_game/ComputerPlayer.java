package cn.simplelife.homework._08_game;

import java.util.Scanner;

/**
 * 电脑玩家类
 */
public class ComputerPlayer extends GamePlayer {

    public void hand(ComputerPlayer computerPlayer) {
        Scanner scanner = new Scanner(System.in);
        // 产生1-3的随机数 1-石头 2-剪刀 3-布
        int computerHandType = (int) (Math.random() * (3 - 1 + 1) + 1);
        // 设置电脑玩家的出拳
        computerPlayer.setType(computerHandType);
        if (computerHandType == 1) {
            System.out.println(computerPlayer.getName() + "-->出拳：石头");
        }
        if (computerHandType == 2) {
            System.out.println(computerPlayer.getName() + "-->出拳：剪刀");
        }
        if (computerHandType == 3) {
            System.out.println(computerPlayer.getName() + "-->出拳：布");
        }
    }
}
