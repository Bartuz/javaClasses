class Program {
  public static void main(String[] argv){ 
    // Task 1
    for (int i = 1; i <= 10; i++) {
      System.out.println(i);
    }

    // Task 2

    int var = 2;

    for (int i = 1; i <= 10 ; i++) {
      System.out.println(i * 2);
    }

    // Task 3

    int x = 2;

    System.out.println("There is given x = " + x);
    System.out.println("I start while loop with condition ( x > 2)");
    while(x > 2) {
      System.out.println("I'm inside while loop");
    }
    System.out.println("While loop finished");

    x = 2;
    System.out.println("I start while do-while loop with condition ( x > 2)");
    do {
      System.out.println("I'm inside do-while loop");
    } while (x > 2);

    System.out.println("I'm outside do-while loop");

    // Task 4

    double result = 1;
    double temp = 1;
    for (int i = 1; i < 10; i++) {
      temp *= 2;
      result += (1 / temp);
    }
    System.out.println("The result is: " + result);

    // TASK 5

    for (int i = 1; i <= 5 ; i++) {
      for (int j = 1; j <= i ; j++ ) {
        System.out.print("*");
      }
      System.out.print("\n");
    }

    // TASK 6
    int[] ints = {1, 2, 0, -4, 5, 6, -5};
    int lowest = ints[0];
    int position = 1;
    for (int i = 1; i < ints.length; i++) {
      if (ints[i] < lowest) {
        lowest = ints[i];
        position = i+1;
      }
    }
    System.out.println("The lowest number is: " + lowest + " which has position " + position + " of array");

    // TASK 7
    System.out.println("Unsroted array:");
    System.out.print("[ ");
    for (int i = 0; i < ints.length-1 ;  i++) {
      System.out.print(ints[i] + ", ");
    }
    System.out.println(ints[ints.length - 1]+ " ]");

    int sortLowestPosition;
    int sortLowest;
    int swapTemp;
    for (int i = 0; i < ints.length - 1; i++) {
      sortLowest = ints[i];
      sortLowestPosition = i;
      for (int j = i+1; j < ints.length ; j++ ) {
        if (ints[j] < sortLowest){
          sortLowestPosition = j;
          sortLowest = ints[j];
        }
      }
      if (sortLowest != ints[i]) {
        swapTemp = ints[i];
        ints[i] = sortLowest;
        ints[sortLowestPosition] = swapTemp;
      }
    }

    System.out.println("Sorted array: ");
    System.out.print("[ ");
    for (int i = 0; i < ints.length - 1;  i++) {
      System.out.print(ints[i] + ", ");
    }
    System.out.println(ints[ints.length - 1]+ " ]");
  }  
}