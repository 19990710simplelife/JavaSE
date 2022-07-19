package cn.simplelife.homework._08_game;

/**
 * 用户玩家类
 */

public class UserPlayer extends GamePlayer {

    public void hand(UserPlayer userPlayer) {
        if (userPlayer.getType() == 1) {
            System.out.println(userPlayer.getName() + "-->出拳：石头");
        }
        if (userPlayer.getType() == 2) {
            System.out.println(userPlayer.getName() + "-->出拳：剪刀");
        }
        if (userPlayer.getType() == 3) {
            System.out.println(userPlayer.getName() + "-->出拳：布");
        }
    }
}
