package com.mycompany.javaapplication1;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AdderTest {
  @Test
  public void testaAdder() {
    double sum = Adder.add(2, 4);
    assertEquals(6.0, sum, 0.1);
  }
}

