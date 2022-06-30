package com.wenruo.singleton;

/**
 * 饿汉式
 * 类加载到内存后，就实例化一个单例，JVM保证线程安全
 * 简单实用。推荐使用
 * 唯一缺点：不管用到与否，类加载时就完成实例化
 *
 * @author XiaoXiao
 * @Date 2022/6/30 21:59
 **/
public class Mar01 {
    private static final Mar01 INSTANCE = new Mar01();

    private Mar01() {};

    public static Mar01 getInstance() {
        return INSTANCE;
    }

    public void m() {
        System.out.println("m");
    }

    public static void main(String[] args) {
        Mar01 mar01 = Mar01.getInstance();
        Mar01 mar02 = Mar01.getInstance();
        System.out.println(mar01 == mar02);
    }
}
