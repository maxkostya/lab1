package com.example.lab1;

public class getminmax {
    /**
     *
     * @param a
     * @param b
     * @return
     */
    public static int Min(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    /**
     *
     * @param a
     * @param b
     * @return
     */
    public static int Max(int a, int b) {
        if (a < b) {
            return b;
        } else {
            return a;
        }
    }
}

