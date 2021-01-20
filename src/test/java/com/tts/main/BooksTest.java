package com.tts.main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BooksTest {

    @Test
    void isBorrowed() {
        boolean expected = false;
        boolean actual;
        assertEquals(expected, isBorrowed());
    }
}