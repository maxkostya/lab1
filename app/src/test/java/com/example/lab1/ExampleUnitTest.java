package com.example.lab1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void Min1() {
        assertEquals(getminmax.Min(2, 1), 1);
    }

    @Test
    public void Min2() {
        assertEquals(getminmax.Min(1, 2), 1);
    }

    @Test
    public void Min3() {
        assertEquals(getminmax.Min(2, -1), -1);
    }

    @Test
    public void Min4() {
        assertEquals(getminmax.Min(-2, -1), -1);
    }

    @Test
    public void Max1() {
        assertEquals(getminmax.Max(2, 1), 2);
    }

    @Test
    public void Max2() {
        assertEquals(getminmax.Max(1, 1), 2);
    }

    @Test
    public void Max3() {
        assertEquals(getminmax.Max(-2, 1), 1);
    }

    @Test
    public void Max4() {
        assertEquals(getminmax.Max(-2, -1), -1);
    }
}


