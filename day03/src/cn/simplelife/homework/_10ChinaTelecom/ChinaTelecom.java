package cn.simplelife.homework._10ChinaTelecom;

public class ChinaTelecom extends NetworkOperator implements IBase {
    @Override
    public void IInternet() {
        System.out.println("上网");
    }

    @Override
    public void ICall() {
        System.out.println("打电话");
    }
}
