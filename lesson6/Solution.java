import java.util.Random;

class Solution {
  // boolean isIncluded(int, int[]);
  // boolean isIncluded(int number, int[][]);
  public static void main(String[] args) {
    Random rand = new Random();
    // TASK 1
    boolean isRaining = rand.nextBoolean();
    if (isRaining) System.out.println("Better get an umbrella!");
    else System.out.println("You can wear snickers today!");

    // // TASK 2
    int number = rand.nextInt(5) - 5;
    // int[][] range = { {-15, -10}, {-5, 0}, {5,10} }};
    // D = Range A ^ B : (-15, -13] U (-5,-3])
    // D ^ C : [-4, -3]
    boolean isIncluded = (number >= (-4)) && (number <= (-3));
    System.out.println("Is number " + number + " included in range? It's " + isIncluded);

    // // TASK 3
    // // A ^ B = (-15, -13)
    // // C = (-inf, -15], D = [-13, -10)
    boolean isIncludedInC = number <= -15;
    boolean isIncludedInD = ( (number >= (-13) ) && (number < -10 ));
    isIncluded = (isIncludedInC && !isIncludedInD) || (!isIncludedInC && isIncludedInD);
    System.out.println("Is number " + number + " included in range? It's " + isIncluded);

    // TASK 4
    double sqTwo = Math.sqrt(2);
    double answer = Math.pow(sqTwo, 2) - 2;
    System.out.println("sqrt(2) ^ 2 - 2 = " + answer);

    // TASK 5
    int positiveNumber = rand.nextInt(100) + 1;
    int floor = 0;
    for (int i = 1; i <= positiveNumber ; i++) {
      if (Math.pow(i,2) > positiveNumber) {
        floor = i -1; 
        break;
      }
    }
    System.out.println("Floor of sqrt(" + positiveNumber + ") = " + floor);
  }
  // }
  // isIncluded(int number, int[] range1, int[] range2){
  //   if numer
  // }
  // isIncluded(int number, int[][] ranges){
  //   return isIncluded(number, ranges[0], ranges[1]) && isIncluded(number, ranges[2..-1])
  // }
}