package cn.simplelife.homework._08_game;

/**
 * 裁判功能接口
 */
public interface IJudge {
    /**
     * 计算总局数
     *
     * @return 返回比赛的总局数
     */
    int getTotal();

    /**
     * 比较比赛结果
     *
     * @param computerType 电脑出拳类型
     * @param userGameType 用户出拳类型
     */
    void compare(int computerType, int userGameType);


    /**
     * 判断用户出拳是否符合规定
     *
     * @param userGameType 用户出拳类型
     */
    void checkUserHandType(int userGameType);
}
