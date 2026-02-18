package com.a.alvarez.library.management.system.util;

import java.util.concurrent.atomic.AtomicLong;

public class IdGenerator {

    private static final AtomicLong COUNTER = new AtomicLong(1);

    private IdGenerator() {}

    public static Long nextId() {
        return COUNTER.getAndIncrement();
    }
}
