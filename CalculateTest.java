package com.lirui.tju.sourceforge;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculateTest {
  Calculate calculate=new Calculate();

  @Before
  public void setUp() throws Exception {
  }
  
  @After
  public void tearDown() throws Exception {
  }

  @Test
  public void testAdd() {
    int add=calculate.add(1, 2);
    assertEquals(3, add);
  }

  @Test
  public void testMinus() {
    int minus=calculate.minus(1, 2);
    assertEquals(-1, minus);
  }

  @Test
  public void testMultiply() {
    int multiply=calculate.multiply(1, 2);
    assertEquals(2, multiply);
  }

  @Test(expected = java.lang.ArithmeticException.class, timeout = 50)
  public void testDivide() {
    //double divide=calculate.divide(1, 2);
    assertEquals(4, calculate.divide(8, 0));
  }

}
