public class Main {
  public static void main(String[] args) {
    String text = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    
    String bestCase = "A";

    // * Initialize startTime here
     long startTimeBestCase = System.nanoTime();
    int index = match(text, bestCase);
    // * Initialize endTime here
    long endTimeBestCase = Systsem.nanoTime();
    // * Calculate elapsedTime here
    long elapsedTimeBestCase = endTimeBestCase - startTimeBestCase;
    if (index >= 0)
      System.out.println("best-case input matched at index " + index);
    else
      System.out.println("best-case input unmatched");  
      System.out.println("Elapsed time for best-case:" + elapsedTimeBestCase +"nanoseconds"); 

    String worstCase = "XYZ";
    
    // * Initialize startTime here
    long startTimeWorseCase = System.nanoTime();
    index = match(text, worstCase);
    // * Initialize endTime here
    long endTimeWorstCase = System.nanoTime();
    // * Calculate elapsedTime here
    long elapsedTimeBestCase = endTimeWorstCase - startTimeWorstCase;
    if (index >= 0)
      System.out.println("worst-case input matched at index " + index);
    else
      System.out.println("worst-case input unmatched");  
  }

  // Return the index of the first match. -1 otherwise.
  public static int match(String text, String pattern) {
    for (int i = 0; i < text.length() - pattern.length() + 1; i++) {
      if (isMatched(i, text, pattern))
        return i;
    }

    return -1;
  }
	
  // Test if pattern matches text starting at index i
  private static boolean isMatched(int i, String text, 
      String pattern) {
    for (int k = 0; k < pattern.length(); k++) {
      if (pattern.charAt(k) != text.charAt(i + k)) {
        return false;
      }
    }
    
    return true;
  }
}