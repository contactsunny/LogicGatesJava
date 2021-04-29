package com.contactsunny.poc.logicgates;

import java.util.Arrays;

public class App {

    private static final int[] a = { 1, 0, 1, 0, 1 };
    private static final int[] b = { 0, 1, 1, 0, 0 };
    private static int[] c = new int[a.length];

    public static void main(String[] args) {

        System.out.println("a[]: " + Arrays.toString(a));
        System.out.println("b[]: " + Arrays.toString(b));

        andGate();
        orGate();
        nandGate();
        norGate();
        notGate();
        xorGate();
        xnorGate();
    }

    private static void xnorGate() {
        System.out.println("XNOR Gate:");
        for (int index = 0; index < a.length; index++) {
            c[index] = xnor(a[index], b[index]);
        }
        printResult(c);
    }

    private static void xorGate() {
        System.out.println("XOR Gate:");
        for (int index = 0; index < a.length; index++) {
            c[index] = xor(a[index], b[index]);
        }
        printResult(c);
    }

    private static void notGate() {
        System.out.println("NOT Gate for a[]:");
        for (int index = 0; index < a.length; index++) {
            c[index] = not(a[index]);
        }
        printResult(c);
    }

    private static void norGate() {
        System.out.println("NOR Gate:");
        for (int index = 0; index < a.length; index++) {
            c[index] = nor(a[index], b[index]);
        }
        printResult(c);
    }

    private static void nandGate() {
        System.out.println("NAND Gate:");
        for (int index = 0; index < a.length; index++) {
            c[index] = nand(a[index], b[index]);
        }
        printResult(c);
    }

    private static void orGate() {
        System.out.println("OR Gate:");
        for (int index = 0; index < a.length; index++) {
            c[index] = or(a[index], b[index]);
        }
        printResult(c);
    }

    private static void andGate() {
        System.out.println("AND Gate:");
        for (int index = 0; index < a.length; index++) {
            c[index] = and(a[index], b[index]);
        }
        printResult(c);
    }

    private static int and(int a, int b) {
        return a * b;
    }

    private static int or(int a, int b) {
        int sum = a + b;
        if (sum > 0) {
            sum = 1;
        }
        return sum;
    }

    private static int nand(int a, int b) {
        int product = and(a, b);
        return not(product);
    }

    private static int not(int a) {
        if (a == 0) {
            return 1;
        }
        return 0;
    }

    private static int nor(int a, int b) {
        int sum = or(a, b);
        return not(sum);
    }

    private static int xor(int a, int b) {
        return a + b - 2 * a * b;
    }

    private static int xnor(int a, int b) {
        return not(xor(a, b));
    }

    private static void printResult(int[] c) {
        System.out.println("  -  -   -  ");
        System.out.println("| a  b | c |");
        System.out.println("| -  - | - |");
        for (int index = 0; index < a.length; index++) {
            System.out.println("| " + a[index] + "  " + b[index] + " | " + c[index] + " |");
        }
        System.out.println("  -  -   -  ");
    }
}
