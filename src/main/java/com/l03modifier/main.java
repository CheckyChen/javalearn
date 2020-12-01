package com.l03modifier;

public class main {

    private static final int tmp = 1111;

    public static void main(String[] args) {

        //  default (即默认，什么也不写）: 在同一包内可见，不使用任何修饰符。使用对象：类、接口、变量、方法。
        //  private : 在同一类内可见。使用对象：变量、方法。 注意：不能修饰类（外部类）
        //  public : 对所有类可见。使用对象：类、接口、变量、方法
        //  protected : 对同一包内的类和所有子类可见。使用对象：变量、方法。 注意：不能修饰类（外部类）。

        //  static 修饰符
        //  静态变量：
        //  static 关键字用来声明独立于对象的静态变量，无论一个类实例化多少对象，它的静态变量只有一份拷贝。 静态变量也被称为类变量。局部变量不能被声明为 static 变量。
        //  静态方法：
        //  static 关键字用来声明独立于对象的静态方法。静态方法不能使用类的非静态变量。静态方法从参数列表得到数据，然后计算这些数据。

        // final 修饰符
        // final 变量：
        // final 表示"最后的、最终的"含义，变量一旦赋值后，不能被重新赋值。被 final 修饰的实例变量必须显式指定初始值。
        // final 修饰符通常和 static 修饰符一起使用来创建类常量。

        final int val = 1111;
        //val = 222;//报错：cannot assign value to final variable 'val'

        // abstract 修饰符
        // 抽象类：
        // 抽象类不能用来实例化对象，声明抽象类的唯一目的是为了将来对该类进行扩充。
        // 一个类不能同时被 abstract 和 final 修饰。如果一个类包含抽象方法，那么该类一定要声明为抽象类，否则将出现编译错误。

        // 抽象方法:
        // 抽象方法是一种没有任何实现的方法，该方法的的具体实现由子类提供。
        // 抽象方法不能被声明成 final 和 static。
        // 任何继承抽象类的子类必须实现父类的所有抽象方法，除非该子类也是抽象类。
        // 如果一个类包含若干个抽象方法，那么该类必须声明为抽象类。抽象类可以不包含抽象方法。

        // transient 修饰符
        // 序列化的对象包含被 transient 修饰的实例变量时，java 虚拟机(JVM)跳过该特定的变量。
        // 该修饰符包含在定义变量的语句中，用来预处理类和变量的数据类型。

        // volatile 修饰符
        // volatile 修饰的成员变量在每次被线程访问时，都强制从共享内存中重新读取该成员变量的值。而且，当成员变量发生变化时，会强制线程将变化值回写到共享内存。这样在任何时刻，两个不同的线程总是看到某个成员变量的同一个值。
    }


    // synchronized 修饰符
    // synchronized 关键字声明的方法同一时间只能被一个线程访问。synchronized 修饰符可以应用于四个访问修饰符。
    /*
     * 这个方法，每次只能一个线程访问
     */
    static synchronized void computeThings() {
        System.out.println("同步执行的方法");
    }

}

// 抽象类
abstract class AbstractClass {
    // 抽象方法
    abstract void abstractFunc();
}

interface Runnable {
    public void run();

    public void stop();
}

// ClassA 被final 修饰，不允许被继承
final class ClassA {
}
// class ClassB extends ClassA{} // 报错：cannot inherit from final 'com.l03modifier.ClassA'

class User {
    private String name;
    private transient int age; // 序列化的时候，不会被持久化
}

class MyRunnable implements Runnable {

    private volatile boolean active = true;
    public void run() {

        while (active) {

        }
    }

    public void stop() {
        active = false;
    }
}

// 以上方法，当第一个线程执行run方法时，程序会一直循环，但是当第二个线程执行了stop方法后，第一个线程会停止循环，因为 volatile 修饰的变量是同一个内存中
// 只要其中的一个线程改变了该变量的值，所有线程中的该变量的值都会改变



