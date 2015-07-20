/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10;

/**
 *
 * @author Jonny
 */
public class Main {
  
//The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
//
//Find the sum of all the primes below two million.

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    long ans = 2;
    for(int i = 3; i < 2000000; i+=2){
      if(isPrime(i)){
        ans +=i;
      }
    }
    System.out.println(ans);
  }
  
  private static boolean isPrime(long num) {
    for (long i = 2; i <= Math.sqrt(num); i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }
}
