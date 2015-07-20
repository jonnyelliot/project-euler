/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5;

/**
 *
 * @author Jonny
 */
public class Main {
//2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
//
//What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    int maxDivisor = 20;
    boolean answerFound = false;
    int currentDivisor = maxDivisor / 2 + 1;
    long posAnswer = currentDivisor;
    long i = 1;
    while (!answerFound) {
      if (posAnswer % currentDivisor == 0) {
        i = posAnswer;
        currentDivisor++;
        answerFound = (currentDivisor == maxDivisor);
      } else {
        posAnswer += i;
      }
    }
    System.out.println(posAnswer);
  }
}