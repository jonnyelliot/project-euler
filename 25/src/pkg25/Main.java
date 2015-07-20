/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2;

/**
 *
 * @author Jonny
 */
public class Main {
//  
//The 12th term, F12, is the first term to contain three digits.
//
//What is the first term in the Fibonacci sequence to contain 1000 digits?

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    int currentFib = 2;
    int previousFib = 1;
    int ans = 0;
    int nextFib;
    while (currentFib < 4000000) {
      if(currentFib % 2 == 0){
        ans += currentFib;
      }
      nextFib = currentFib + previousFib;
      previousFib = currentFib;
      currentFib = nextFib;
    }
    System.out.println(ans);
  }
}
