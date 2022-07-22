package cn.simplelife.homewrk._03_uuid;

import java.util.UUID;

public class UUIDDemo {
    public static void main(String[] args) {
        /**
         * 获取uuid随机数
         */
        UUID uuid = UUID.randomUUID();
        System.out.println(uuid.toString());
        System.out.println(uuid.toString().replaceAll("-", "").substring(5, 11));
    }
}
