package cn.simplelife.homewrk._08_togglecase;

public class Print implements ILowercaseLetter, IUppercaseLetter {
    /**
     * 字符
     */
    private String str;
    private StringBuilder stringBuilder = new StringBuilder();

    public Print(String str) {
        this.str = str;
    }


    @Override
    public void printLowercaseLetter() {
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 'A' && arr[i] <= 'Z') {
                arr[i] = (char) ((int) arr[i] + 32);
            }
            stringBuilder.append(arr[i]);
        }
        System.out.println(stringBuilder);
    }

    @Override
    public void printUppercaseLetter() {
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 'a' && arr[i] <= 'z') {
                arr[i] = (char) ((int) arr[i] - 32);
            }
            stringBuilder.append(arr[i]);
        }
        System.out.println(stringBuilder);
    }
}
