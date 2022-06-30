package com.wenruo.singleton;

/**
 * 懒汉式
 * 多线程时有问题
 * @author XiaoXiao
 * @Date 2022/6/30 22:12
 **/
public class Mar03 {

    private static Mar03 INSTANCE;

    private Mar03() {};

    public static Mar03 getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Mar03();
        }
        return INSTANCE;
    }

    public void m() {
        System.out.println("m");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Mar03.getInstance().hashCode());
            }).start();
        }
    }

}
