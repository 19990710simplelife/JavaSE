package cn.simplelife.homework._10ChinaTelecom;

public class ChinaUnicom extends NetworkOperator implements IChat {
    @Override
    public void IInternet() {
        System.out.println("上网");
    }

    @Override
    public void ICall() {
        System.out.println("打电话");
    }

    @Override
    public void chat() {
        System.out.println("飞信聊天");
    }
}
