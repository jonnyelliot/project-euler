/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1;

/**
 *
 * @author Jonny
 */
public class Main {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Add all the natural numbers below one thousand that are multiples of 3 or 5.
    int ans = 0;
    for (int i = 0; i < 1000; i++) {
      if (i % 5 == 0 || i % 3 == 0) {
        ans += i;
      }
    }
    System.out.println(ans);
  }
}
