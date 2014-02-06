package taojava.assignment03;

import java.math.BigInteger;

public class Calculator
{

  public static BigInteger eval0(String equation)
  {
    String[] brokenEq = StringUtils.splitAt(equation, ' ');
    int i = 0;
    BigInteger current = new BigInteger(brokenEq[0]);
    for (i = 2; i < brokenEq.length; i += 2)
      {
        if (brokenEq[i - 1].equals("+"))
          {
            BigInteger toCombine = new BigInteger(brokenEq[i]);
            current = current.add(toCombine);
          }// if
        else if (brokenEq[i - 1].equals("-"))
          {
            BigInteger toCombine = new BigInteger(brokenEq[i]);
            current = current.subtract(toCombine);
          }// elif
        else if (brokenEq[i - 1].equals("*"))
          {
            BigInteger toCombine = new BigInteger(brokenEq[i]);
            current = current.multiply(toCombine);
          }// elif
        else if (brokenEq[i - 1].equals("/"))
          {
            BigInteger toCombine = new BigInteger(brokenEq[i]);
            current = current.divide(toCombine);
          }// elif
        else if (brokenEq[i - 1].equals("^"))
          {
            int toCombine = Integer.parseInt(brokenEq[i]);
            current = current.pow(toCombine);
          }// elif
        else
          System.out.print("Sorry, but something went wrong ;_;");
      }// for
    return current;
  }// eval0()

  /**
   * @param args
   */
  public static void main(String[] args)
  {

  }

}
