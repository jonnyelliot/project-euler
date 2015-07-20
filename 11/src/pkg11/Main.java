/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Jonny
 */
public class Main {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    int[][] grid = new int[20][20];
    try {
      BufferedReader br = new BufferedReader(new FileReader("grid.txt"));
      Pattern p = Pattern.compile("((\\d\\d)\\s?)");
      String line;
      int[] numLine;
      int i = 0;
      while ((line = br.readLine()) != null) {
        Matcher m = p.matcher(line);
        numLine = new int[20];
        int j = 0;
        while (m.find()) {
          numLine[j] = Integer.parseInt(m.group(1).trim());
          j++;
        }
        grid[i] = numLine;
        i++;
      }
    } catch (IOException ex) {
      Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
    }
    long ans = 0;
    for (int i = 3; i < grid.length - 3; i++) {
      for (int j = 3; j < grid.length - 3; j++) {
        // vertical
        ans = Math.max(grid[i][j] * grid[i][j - 1] * grid[i][j - 2] * grid[i][j - 3], ans);
        // horizontal
        ans = Math.max(grid[i][j] * grid[i - 1][j] * grid[i - 2][j] * grid[i - 3][j], ans);
        // bottom-left to top-right
        ans = Math.max(grid[i][j] * grid[i + 1][j - 1] * grid[i + 2][j - 2] * grid[i + 3][j - 3], ans);
        // top-left to bottom-right
        ans = Math.max(grid[i][j] * grid[i - 1][j - 1] * grid[i - 2][j - 2] * grid[i - 3][j - 3], ans);

      }
    }
    System.out.println(ans);
  }
}