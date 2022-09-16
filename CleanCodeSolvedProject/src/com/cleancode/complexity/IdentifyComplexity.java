package com.cleancode.complexity;

import java.util.concurrent.CompletableFuture;

public class IdentifyComplexity {

    public static void complexity (int limit) {
        for (int i = 0; i <= limit; i++) System.out.println(i);
    }

    public static void complexity2 (int limit) {
        for (int i = 0; i <= limit; i++) {
            for (int j = 0; j <= limit; j++)
            System.out.println(i*j);
        }

        for (int k = 0; k <= limit; k++) {
            System.out.println(k*100);
        }
    }

}
