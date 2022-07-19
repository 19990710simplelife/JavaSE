package cn.simplelife.homework._02_singletonhomework._01_singleton;

/**
 * 单例模式与静态方法工具类的异同点
 * 相同点：
 * 1、构造器都被私有化、外部不能创建该类的实例对象
 * 不同点:
 * 1、静态工具类中的工具方法必须是静态的，以便外部使用的时候采用类名.方法名进行访问
 * 2、单例模式中的工具方法不是静态的，只能通过单例的实例对象去访问
 * 3、单例模式会提提供一个公共的方法返回该类的实例对象，且该对象不可以再次被修改
 */
public class SingletonTest {
    public static void main(String[] args) {
        int[][][] arr = {{{1, 2, 3}}, {{4, 5, 6}}};
        // 调用Singleton中的方法获取该类唯一的对象
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        // 内存中只会存在一个实例对象所以两个对象的指向地址是一样的
        System.out.println(instance == instance1);
        // 使用实例对象调用工具方法
        instance.getItemInArray(arr);

    }
}
