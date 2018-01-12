import java.io.*;
import java.util.*;

class numberOfPaths {

  static int numOfPathsToDest(int n) {
    // your code goes here
    int [][] numPaths = new int[n][n];
    int sumNeighbours;
    
    numPaths[n - 1][0] = 1;  // set as 1 // i, j, think out loud -> talk 
    
    for (int i = n - 1; i >= 0; i--) { // i, j does not -> meaningful name horizontal/ vertical
      for (int j =  n - i - 1; j < n; j++) { // left / top - 0, 0, left/bottom 0, 0
        sumNeighbours = 0;  // 
        
        if (j > 0) {
          sumNeighbours += numPaths[i][j - 1];
        }
        
        if (i < n - 1) {
          sumNeighbours += numPaths[i + 1][j];
        }
        
        numPaths[i][j] += sumNeighbours; // 1, structure -> white board         
      }
    }  
    
    return numPaths[0][n - 1]; // do not write debug statement -> whiteboard, every line 
}

  public static void main(String[] args) {
      int size = 4;
      
      System.out.println(numOfPathsToDest(size));
  }

}