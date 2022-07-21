package cn.simplelife.work._04_math;

import java.util.UUID;

public class UUIDTest {
    public static void main(String[] args) {
        UUID uuid = UUID.randomUUID();
        System.out.println("uuid = " + uuid);

        String substring = uuid.toString().substring(0, 6);
        System.out.println(substring);

        String s = uuid.toString().replaceAll("-", "");
        System.out.println(s);
    }
}
