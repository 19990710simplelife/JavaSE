package cn.simplelife.homewrk._07_calculator;

public class UseCom {
    public void useCompute(ICompute com, int num1, int num2) {
        if (com instanceof Add) {
            System.out.println(new Add().computer(num1, num2));
        } else if (com instanceof Subtract) {
            System.out.println(new Subtract().computer(num1, num2));
        } else if (com instanceof Multiply) {
            System.out.println(new Multiply().computer(num1, num2));
        } else if (com instanceof Divide) {
            System.out.println(new Divide().computer(num1, num2));
        } else {
            System.out.println("参数错误!");
        }
    }
}
