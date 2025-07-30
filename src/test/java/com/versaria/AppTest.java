package com.versaria;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testTimeCalculation() {
        // Тест задачи 1
        double time = 0;
        assertEquals(0.0, time, 0.001);

        // Тест задачи 2
        double distance = 80;
        final double SPEED = 40;
        time = distance / SPEED;
        assertEquals(2.0, time, 0.001);

        // Тест задачи 3
        double timeInMinutes = time * 60;
        assertEquals(120.0, timeInMinutes, 0.001);
    }

    @Test
    public void testConstants() {
        // Можно добавить реальные проверки
        assertTrue(true);
    }

    @Test
    public void testMainMethod() {
        // Заглушка для теста main
        assertTrue(true);
    }
}