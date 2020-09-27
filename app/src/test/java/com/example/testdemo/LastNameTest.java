package com.example.testdemo;

import org.junit.Test;

import static org.junit.Assert.*;

public class LastNameTest {

    @Test
    public void getLastName() {
        MainActivity mainActivity = new MainActivity();

        assertEquals("Mann", mainActivity.getLastName("Scott"));
        assertEquals("Doe", mainActivity.getLastName("Lucy"));
        assertEquals("Doe", mainActivity.getLastName(""));
    }
}

