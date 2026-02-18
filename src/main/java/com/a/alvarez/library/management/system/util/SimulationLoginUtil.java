package com.a.alvarez.library.management.system.util;

public final class  SimulationLoginUtil {

    public static void simulateLoading() throws InterruptedException {
        System.out.print("Loading");

        for (int i = 0; i < 5; i++) {
            Thread.sleep(500); // 0.5 second delay
            System.out.print(".");
        }

        System.out.println();
    }
}
