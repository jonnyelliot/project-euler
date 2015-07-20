/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4;

/**
 *
 * @author Jonny
 */
public class Main {

//A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 99.
//
//Find the largest palindrome made from the product of two 3-digit numbers.
  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    int ans = 0;
    for (int i = 100; i < 10000; i++) {
      for (int j = 100; j < 10000; j++) {
        int product = i * j;
        if (product > ans && isPalindrome(""+product)) {
          ans = product;
        }
      }
    }
    System.out.println(ans);
  }
  
  private static boolean isPalindrome(String s) {
    for (int i = 0; i < s.length() / 2; i++) {
      if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
        return false;
      }
    }
    return true;
  }
}
