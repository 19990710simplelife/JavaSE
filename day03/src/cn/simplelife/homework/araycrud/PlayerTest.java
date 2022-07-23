package cn.simplelife.homework.araycrud;

public class PlayerTest {
    public static void main(String[] args) {
        //1、初始化容器
        PlayerList playerList0 = new PlayerList();
        playerList0.add(11);
        playerList0.add(22);
        playerList0.add(33);
        playerList0.add("科比");
        playerList0.add("姚明");
        System.out.println(playerList0.toString());
        System.out.println(playerList0.get(2));
        //2、使用333替换33
        playerList0.set(2, 333);
        System.out.println(playerList0.toString());
        Object remove = playerList0.remove(2);
        System.out.println(remove);

        System.out.println(playerList0.toString());
    }
}
