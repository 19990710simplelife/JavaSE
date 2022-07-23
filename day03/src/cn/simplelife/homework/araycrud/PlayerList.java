package cn.simplelife.homework.araycrud;

import java.util.Arrays;

/**
 * 球员容器
 */
public class PlayerList {
    /**
     * 存储球衣号码的容易
     */
    private Object[] arrayPlayer;

    /**
     * 已上场球员人数
     */
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;

    public PlayerList() {
        // 默认初始化容量为10
        this(DEFAULT_CAPACITY);
    }

    public PlayerList(int capacity) {
        if (capacity < 1) {
            System.out.println("初始化容器不能小于1");
            return;
        }
        this.arrayPlayer = new Object[capacity];
    }

    @Override
    public String toString() {
        // 1、如果数组为null 返回"null"
        if (this.arrayPlayer == null) {
            return "null";
        }
        // 2、如果数组长度为0，返回空数组[]
        if (this.size == 0) {
            return "[]";
        }
        //3、打印数组
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (int i = 0; i < this.size; i++) {
            stringBuilder.append(this.arrayPlayer[i]);
            stringBuilder.append(", ");
        }
        stringBuilder.replace(stringBuilder.length() - 2, stringBuilder.length(), "");
        return stringBuilder.append("]").toString();
    }

    /**
     * 添加元素
     *
     * @param playernum 球员号
     */
    public void add(Object playernum) {
        /**
         * 进行扩容
         */
        if (size == arrayPlayer.length) {
            this.arrayPlayer = Arrays.copyOf(this.arrayPlayer, this.size * 2);
        }
        arrayPlayer[this.size] = playernum;
        this.size++;
    }

    /**
     * 获取元素
     *
     * @param index 索引号
     * @return 返回球员号
     */
    public Object get(int index) {
        if (index < 0 || index >= this.size) {
            System.out.println("参数错误！");
            return -1;
        }
        return this.arrayPlayer[index];
    }

    /**
     * 修改指定位置的值
     *
     * @param index 指定位置的索引
     * @param ele   要替换的元素
     */
    public void set(int index, Object ele) {
        if (index < 0 || index >= this.size) {
            System.out.println("参数错误！");
        }
        this.arrayPlayer[index] = ele;
    }

    /**
     * 删除一个元素
     *
     * @param index 要删除元素的索引
     * @return 返回要删除的元素
     */
    public Object remove(int index) {
        if (index < 0 || index >= this.size) {
            System.out.println("参数错误！");
            return -1;
        }
        for (int i = index; i < this.size - 1; i++) {
            this.arrayPlayer[i] = this.arrayPlayer[i + 1];
        }
        size--;
        this.arrayPlayer[size] = 0;
        // 最终返回被删除的元素
        return arrayPlayer[index];
    }
}
