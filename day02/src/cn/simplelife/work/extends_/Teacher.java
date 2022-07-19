package cn.simplelife.work.extends_;

/**
 * 老师类，字段：姓名 年龄 等级
 */
public class Teacher extends Person {
    private String level;

    public void teach() {
        System.out.println(getName() + "老师上课啦~~~~");
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("级别:" + level);
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

}
