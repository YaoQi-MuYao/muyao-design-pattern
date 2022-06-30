package com.wenruo.singleton;

/**
 * 双重检查 保证线程的安全
 *
 * @author XiaoXiao
 * @Date 2022/6/30 22:24
 **/
public class Mar04 {

    /* volatile 设置内存屏障 防止指令重排 */
    private static volatile Mar04 INSTANCE;

    private Mar04() {};

    public static Mar04 getInstance() {
        if (INSTANCE == null) {
            synchronized (Mar04.class) {
                if (null == INSTANCE) {
                    INSTANCE = new Mar04();
                }
            }
        }
        return INSTANCE;
    }

    public void m() {
        System.out.println("m");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Mar04.getInstance().hashCode());
            }).start();
        }
    }
}
