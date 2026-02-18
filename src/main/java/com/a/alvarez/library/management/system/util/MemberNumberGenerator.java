package com.a.alvarez.library.management.system.util;

import java.util.concurrent.atomic.AtomicLong;

public final class MemberNumberGenerator {

    private static final AtomicLong COUNTER = new AtomicLong(1);

    private static final String PREFIX = "SOC-";

    private MemberNumberGenerator() {}

    public static String nextNumber() {
        return PREFIX + String.format("%05d", COUNTER.getAndIncrement());
    }
}
