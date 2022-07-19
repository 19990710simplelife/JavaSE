package cn.simplelife.homework._03_codeblock;

public class Block {
    private String name;

    public Block(String name) {
        this.name = name;
    }

    public Block() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    {
        System.out.println("初始化代码块执行了~~~");
    }

    static {
        System.out.println("静态代码块执行了~~~");
    }

    public int getSum(int a, int b) {
        int sum = 0;
        {
            System.out.println("局部代码块执行了~~·");
            System.out.println(a + b);
            return a + b;
        }
    }
}
