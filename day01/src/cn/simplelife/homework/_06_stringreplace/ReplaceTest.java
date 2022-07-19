package cn.simplelife.homework._06_stringreplace;

public class ReplaceTest {
    public static void main(String[] args) {
        String[] badwords = {"窝草", "杀人放火", "傻逼", "杀人"};
        String words = "窝草，昨晚又停电了,傻逼，我们去杀人吧！";
        for (int i = 0; i < badwords.length; i++) {
            words = words.replace(badwords[i], "**");
        }
        System.out.println(words);
    }
}
