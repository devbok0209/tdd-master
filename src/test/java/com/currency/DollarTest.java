package com.currency;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DollarTest {

    @Test
    @DisplayName("더하기 테스트")
    void testMultiplication() {
        Dollar product = new Dollar(5);
        Dollar resultTen = product.times(2);
        assertEquals(10, resultTen.amount);
        Dollar resultFifteen = product.times(3);
        assertEquals(15, resultFifteen.amount);
    }

    @Test
    @DisplayName("equal 테스트")
    void testEquality() {
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(6)));
    }

}