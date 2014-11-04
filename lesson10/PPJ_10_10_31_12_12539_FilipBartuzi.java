import java.util.Random;

class PPJ_10_10_31_12_12539_FilipBartuzi {
  static void printArrayInt(int[] arr) {
    System.out.print("[ ");
    for (int i = 0; i < arr.length-1; i++) {
      System.out.print(arr[i] + ", ");
    }
    System.out.println(arr[arr.length-1] + " ]");
  }
  static void printArrayDouble(double[] arr) {
    System.out.print("[ ");
    for (int i = 0; i < arr.length-1; i++) {
      System.out.print(arr[i] + ", ");
    }
    System.out.println(arr[arr.length-1] + " ]");
  }
  public static void main(String[] args) {
    /*
      TASK 1
    */

    Random random = new Random();
    int[] array1 = new int[10];
    int zeroCounter, oneCounter;
    zeroCounter = oneCounter = 0;

    /*
      TASK 2,3
    */

    for (int i = 0; i < array1.length ; i++){
      array1[i] = random.nextInt(2);
      if (array1[i] == 1)
        oneCounter++;
      else
        zeroCounter++;
    }
    printArrayInt(array1);
    System.out.println("1 appears " + oneCounter + " times."); 
    System.out.println("1 appears " + zeroCounter + " times.");

    /*
      TASK 4
    */


    double[] array2 = new double[10];

    for (int i = 0; i < array2.length ; i++){
      array2[i] = random.nextDouble() * 20;
      if (((int)array2[i] & 1) == 1)
        System.out.println("Odd number: " + array2[i]);
    }
    printArrayDouble(array2);
    for (int i = 0; i < array2.length; i+=2) {
      System.out.println(array2[i]);
    }

    /*
      TASK 5
    */

    // 0, 111, 222

    // 0, 111

    // 0

    /*
      TASK 6
    */

    int array3[][] = new int[4][5];

    for (int i = 0; i < array3.length; i++) {
      for (int j = 0; j < array3[i].length ; j++) {
        array3[i][j] = random.nextInt(10) + 1;
      }
    }

    for (int i = 0; i < array3.length ; i++) {
      printArrayInt(array3[i]);
    }

  }
}