/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20;

import java.math.BigInteger;

/**
 *
 * @author Jonny
 */
public class Main {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    BigInteger fact100 = BigInteger.ONE;
    for (int i = 2; i <= 100; i++) {
      fact100 = fact100.multiply(new BigInteger(""+i));
    }
    int ans = 0;
    for (int i = 0; i < fact100.toString().length(); i++) {
      ans += Integer.parseInt(fact100.toString().substring(i, i+1));
    }
    System.out.println(ans);
  }
}
