package com.wenruo.singleton;

/**
 * 线程安全 同时 防止反序列换 原因是因为枚举没有构造方法 无法通过反射构造方法创建对象
 *
 * @author XiaoXiao
 * @Date 2022/6/30 22:35
 **/
public enum Mar06 {

    INSTANCE;

    public void m() {}

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Mar06.INSTANCE.hashCode());
            }).start();
        }
    }
}
