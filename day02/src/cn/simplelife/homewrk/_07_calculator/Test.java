package cn.simplelife.homewrk._07_calculator;

public class Test {
    public static void main(String[] args) {
        UseCom useCom = new UseCom();
        useCom.useCompute(new Add(), 10, 10);
        useCom.useCompute(new Subtract(), 10, 10);
        useCom.useCompute(new Multiply(), 10, 10);
        useCom.useCompute(new Divide(), 10, 10);
    }
}
