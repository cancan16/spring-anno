package com.enjoy.cap12;

import java.sql.Array;
import java.util.concurrent.atomic.AtomicInteger;

public class TestThreadLocal {

    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger();
        atomicInteger.addAndGet(1);
        ThreadLocal threadLocal = new ThreadLocal();
        ThreadLocal threadLocal2 = new ThreadLocal();
        threadLocal.set(1);
        threadLocal2.set(2);

    }
}
