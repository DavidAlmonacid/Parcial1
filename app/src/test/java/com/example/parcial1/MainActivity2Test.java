package com.example.parcial1;

import junit.framework.TestCase;

public class MainActivity2Test extends TestCase {
    public void testCalcularTotal() {
        int totalTomate = 500 * 3;
        int totalCebolla = 300 * 7;
        int result = MainActivity2.calcularTotal(totalTomate, totalCebolla);
        assertEquals(3600, result);
    }
}
