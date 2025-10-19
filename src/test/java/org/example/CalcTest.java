package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalcTest {
  Calc c = new Calc();

    @Test
    void testAddition() {
        assertEquals(4, c.add(2,2));
    }
        // 期望 4-2=2，但若 subtract 方法返回错误值（如 0、5），则测试失败

    @Test
    void testSubtraction() {
        assertEquals(2, c.subtract(4,2));
    }
}
