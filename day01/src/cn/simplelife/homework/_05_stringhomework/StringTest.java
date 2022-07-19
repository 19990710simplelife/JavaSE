package cn.simplelife.homework._05_stringhomework;

public class StringTest {
    public static void main(String[] args) {
        String str = "123"; //直接在字符串常量池中创建一个字符
        String string=new String("");
        String str1 = new String("123"); //在堆内存中创建一个对象，在该对象内引用字符串常量池中的123的地址

        String str2 = 1 + "2" + 3; //最终编译为"123"此时还是会去引用字符串常量池中的"123"的地址
        System.out.println(str == str1);//一个在字符串常量池中，一个在堆内存中，地址不一样 fasle
        System.out.println(str == str2); //true
        System.out.println(str.equalsIgnoreCase(str1));//比较的是内容 true

        if (string != null && !("".equalsIgnoreCase(string))) {
            System.out.println(123);
        }
    }
}
