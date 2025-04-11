package com.bugdevs;

public final class Euclidean {
    private Euclidean() {
    }
    static int euclideanAlgorithm(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
