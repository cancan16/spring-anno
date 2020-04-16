package com.enjoy.cap12;

public class TestThreadLocal {

    public static void main(String[] args) {
        ThreadLocal threadLocal = new ThreadLocal();
        ThreadLocal threadLocal2 = new ThreadLocal();
        threadLocal.set(1);
        threadLocal2.set(2);


    }
}
