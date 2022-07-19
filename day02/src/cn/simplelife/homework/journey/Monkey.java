package cn.simplelife.homework.journey;

public class Monkey extends Prentice {
    private String formula;

    public void doMaigre() {
        System.out.println("吃饭了~~");
    }

    public void extDevil() {
        System.out.println("又要出去打妖怪啦！");
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }
}
