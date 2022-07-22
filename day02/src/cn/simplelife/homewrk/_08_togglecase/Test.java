package cn.simplelife.homewrk._08_togglecase;

public class Test {
    public static void main(String[] args) {
        ILowercaseLetter iLowercaseLetter = new Print("FDFSDdsf");
        IUppercaseLetter iUppercaseLetter = new Print("SADsdfsdf");
        /**
         * 大写转小写
         */
        iLowercaseLetter.printLowercaseLetter();

        /**
         * 小写转大写
         */
        iUppercaseLetter.printUppercaseLetter();

    }
}
