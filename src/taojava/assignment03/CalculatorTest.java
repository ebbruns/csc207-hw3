package taojava.assignment03;

import static org.junit.Assert.*;

import java.math.BigInteger;

import org.junit.Test;

public class CalculatorTest
{

  @Test
  public void testEval0()
  {
    assertEquals(BigInteger.valueOf(0), Calculator.eval0("0"));
    assertEquals(BigInteger.valueOf(2), Calculator.eval0("1 + 1"));
    assertEquals(BigInteger.valueOf(4), Calculator.eval0("1 + 2 + 1"));
    assertEquals(BigInteger.valueOf(9), Calculator.eval0("1 + 2 * 3"));
    assertEquals(BigInteger.valueOf(-6), Calculator.eval0("1 ^ 2 - 3 * 3"));
    assertEquals(BigInteger.valueOf(11), Calculator.eval0("2 + 20 / 2"));
  }

}
