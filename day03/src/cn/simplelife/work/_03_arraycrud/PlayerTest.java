package cn.simplelife.work._03_arraycrud;

public class PlayerTest {
    public static void main(String[] args) {
        //1、初始化容器
        PlayerList playerList0 = new PlayerList();
        playerList0.add(11);
        playerList0.add(22);
        playerList0.add(33);
        playerList0.add(44);
        playerList0.add(55);
        playerList0.add(66);
        System.out.println(playerList0.toString());
        System.out.println(playerList0.get(2));
        //2、使用333替换33
        playerList0.set(2, 333);
        System.out.println(playerList0.toString());
        int remove = playerList0.remove(2);
        System.out.println(remove);
        System.out.println(playerList0.toString());
    }
}
