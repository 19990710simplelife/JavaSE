package cn.simplelife.work._05_wrapper;

/**
 * 这是int类型的包装类
 * 使用int基本类型来表示学生的考试成绩，此时怎么区分考试成绩为0和没有成绩两种情况?
 */
public class IntWrapper {
    private int value;

    public IntWrapper(int value) {
        this.value = value;
    }

}
