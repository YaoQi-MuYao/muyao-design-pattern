package com.wenruo.singleton;

/**
 * @author XiaoXiao
 * @Date 2022/6/30 22:10
 **/
public class Mar02 {
    private static final Mar02 INSTANCE;

    static {
        INSTANCE = new Mar02();
    }

    private Mar02() {};

    public static Mar02 getInstance() {
        return INSTANCE;
    }

    public void m() {
        System.out.println("m");
    }

    public static void main(String[] args) {
        Mar02 mar01 = Mar02.getInstance();
        Mar02 mar02 = Mar02.getInstance();
        System.out.println(mar01 == mar02);
    }
}
