/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg9;

/**
 *
 * @author Jonny
 */
public class Main {

//A Pythagorean triplet is a set of three natural numbers, a  b  c, for which,
//
//a2 + b2 = c2
//For example, 32 + 42 = 9 + 16 = 25 = 52.
//
//There exists exactly one Pythagorean triplet for which a + b + c = 1000.
//Find the product abc.
  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    double a = 0;
    double b = 0;
    double c = 0;

    while (a + b + c != 1000) {
      double cSquared = Math.pow(c, 2);
      for (int i = 1; i <= c; i++) {
        double aSquared = Math.pow(i, 2);
        double bSquared = cSquared - aSquared;
        if (Math.rint(Math.sqrt(bSquared)) == Math.sqrt(bSquared)) {

          a = Math.rint(Math.sqrt(aSquared));
          b = Math.rint(Math.sqrt(bSquared));
          c = Math.rint(Math.sqrt(cSquared));
          System.out.println(a + b + c);
          //System.out.println("a = " + a + "\nb = " + b + "\nc = " + c + "\n");
          break;
        }
      }
      c++;
    }
  }
}
