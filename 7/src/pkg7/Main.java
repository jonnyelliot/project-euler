/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7;

/**
 *
 * @author Jonny
 */
public class Main {

//By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
//
//What is the 10 001st prime number?
  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    long primeCounter = 0;
    long i = 2;
    long currentPrime = 0;
    while (primeCounter < 10001) {
      if (isPrime(i)) {
        primeCounter++;
        currentPrime = i;
      }
      i++;
    }
    System.out.println(currentPrime);
  }

  private static boolean isPrime(long num) {
    if (num == 2) {
      return true;
    }
    for (long i = 2; i <= (long) Math.sqrt(num); i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }
}
