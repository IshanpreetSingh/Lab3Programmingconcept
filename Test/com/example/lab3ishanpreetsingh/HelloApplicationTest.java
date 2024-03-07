package com.example.lab3ishanpreetsingh;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloApplicationTest {

    @Test
    void grossselary() {
        HelloApplication x = new HelloApplication();
        assertEquals(x.grossselary(7000),84000);
    }
}