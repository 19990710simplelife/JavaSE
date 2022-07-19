package cn.simplelife.homework._08_game;

public class Judge implements IJudge {

    @Override
    public int getTotal() {
        return 0;
    }

    @Override
    public void compare(int computerType, int userGameType) {
        if (computerType == userGameType) {
            System.out.println("平局");
        }
        // 1、石头 剪刀  2、剪 刀布   3、布 石头
        else if ((computerType == 1 && userGameType == 2) || (computerType == 2 && userGameType == 3) || (computerType == 3 && userGameType == 1)) {
            System.out.println("你输了");
        }
        // 1、剪刀 布  2、布 剪刀 3、石头 布
        else if ((computerType == 2 && userGameType == 1) || (computerType == 3 || userGameType == 2) || (computerType == 1 && userGameType == 3)) {
            System.out.println("你赢了");
        }
    }

    @Override
    public void checkUserHandType(int userGameType) {
    }
}
