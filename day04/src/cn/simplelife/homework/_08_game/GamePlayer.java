package cn.simplelife.homework._08_game;

/**
 * 玩家类
 */
public class GamePlayer {
    private String name;       //玩家姓名
    private int experience;    // 玩家经验值
    private int score;         //玩家得分
    private int type;          //玩家出拳类型

    public GamePlayer() {
    }

    public void hand() {
    }

    public GamePlayer(String name, int experience, int score, int type) {
        this.name = name;
        this.experience = experience;
        this.score = score;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "GamePlayer{" +
                "name='" + name + '\'' +
                ", experience=" + experience +
                ", score=" + score +
                ", type=" + type +
                '}';
    }
}
