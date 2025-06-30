package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
    @Test
    public void testSum_TwoAndThree_ReturnsFive() {
        Calculate calculate = new Calculate();
        assertEquals(5, calculate.sum(2, 3));
    }
    
    @Test
    public void testAverage_TwoAndThree_ReturnsTwoPointFive() {
        Calculate calculate = new Calculate();
        assertEquals(2.5, calculate.average(2, 3), 0.001);
    }
    
    @Test
    public void testSumBetween_OneToTen_ReturnsFiftyFive() {
        Calculate calculate = new Calculate();
        assertEquals(55, calculate.sumBetween(1, 10));
    }
    
    @Test
    public void testSumBetween_TenToOne_ReturnsFiftyFive() {
        Calculate calculate = new Calculate();
        assertEquals(55, calculate.sumBetween(10, 1));
    }
    
    @Test
    public void testSumOddBetween_OneToTen_ReturnsTwentyFive() {
        Calculate calculate = new Calculate();
        assertEquals(25, calculate.sumOddBetween(1, 10));
    }
    
    @Test
    public void testSumEvenBetween_OneToTen_ReturnsThirty() {
        Calculate calculate = new Calculate();
        assertEquals(30, calculate.sumEvenBetween(1, 10));
    }
}