package com.wenruo.singleton;

/**
 * 静态内部类方式
 * JVM保证单例
 * 加载外部类时不会加载内部类，这样可以实现懒加载
 *
 * @author XiaoXiao
 * @Date 2022/6/30 22:31
 **/
public class Mar05 {

    private Mar05() {}

    private static class Mar05Holder {
        private final static Mar05 INSTANCE = new Mar05();
    }

    public static Mar05 getInstance() {
        return Mar05Holder.INSTANCE;
    }

    public void m() {
        System.out.println("m");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Mar05.getInstance().hashCode());
            }).start();
        }
    }
}
