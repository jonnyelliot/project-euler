/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3;


/**
 *
 * @author Jonny
 */
public class Main {

//The prime factors of 13195 are 5, 7, 13 and 29.
//
//What is the largest prime factor of the number 600851475143 ?
  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    long ans = 0;
    long number = 600851475143l;
    for (long i = 1; i < Math.sqrt(number); i++) {
      if (number % i == 0 && isPrime(i)) {
        System.out.println("New largest prime factor: " + i);
        ans = i;
      }
    }
    System.out.println(ans);
  }

  private static boolean isPrime(long num) {
    if (num == 1) {
      return false;
    } else if (num == 2) {
      return true;
    }
    for (long i = 2; i < num / 2; i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }
}
