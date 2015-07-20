/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6;

/**
 *
 * @author Jonny
 */
public class Main {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    int sumSquares =0;
    int squareSum =0;
    for(int i=0; i<=100; i++){
      sumSquares += Math.pow(i, 2);
      squareSum += i;
    }
    squareSum = (int)Math.pow(squareSum, 2);
    System.out.println(Math.abs(sumSquares - squareSum));
  }
}
