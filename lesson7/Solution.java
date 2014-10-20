class Solution {
  public static void main(String[] args) {

    // TASK #1
    boolean isRaining = true;
    // System.out.println(isRaining ? "Is it rainging" : "it is not raining");
    
    String message = (isRaining) ? "It is raining" : "It is not raining";
    System.out.println(message);

    // TASK #2

    boolean isSunny = true;
    String weather;
    if (isRaining) {
      weather = isSunny ? "rainbow" : "slob";
    }
    else {
      weather = isSunny ? "sunny" : "clody";
    }
    System.out.println("The weather for today is " + weather);

    // TASK #3
    // A >= 0
    // B <= 1
    // >= 0 && <= 1

    int v = 3;
    boolean isvInA = (v >= 0) ? true : false;
    boolean isvInB = (v <= 1) ? true : false;
    boolean isvInC = (v >= 0 && v <= 1) ? true : false;

    System.out.println("Is v included in A : " + isvInA);
    System.out.println("Is v included in B : " + isvInB);
    System.out.println("Is v included in C : " + isvInC);

    // TASK #4

    char ch = 'A';
    System.out.println("Hexadicimal of " + ch + " is " + Integer.toHexString((int)ch));

    // TASK #5

    int day = 31;
    int month = 12;
    int[] MONTHS_LENGTH = {31,28,31,30,31,30,31,31,30,31,30,31};
    int sumOfDaysBeforeMonth = 0;
    for (int i = 0; i < month -1; i++) {
      sumOfDaysBeforeMonth += MONTHS_LENGTH[i];
    }
    int dayOfYear = sumOfDaysBeforeMonth + day;

    System.out.println("" + day + "/" + month + " is " + dayOfYear + "th of year");
  }
}