import java.util.Random;

class PPJ_11_11_03_12_12539_FilipBartuzi {

  static void printArray(int[] arr) {
    System.out.print("[ ");
    for (int i = 0; i < arr.length-1; i++) {
      System.out.print(arr[i] + ", ");
    }
    System.out.println(arr[arr.length-1] + " ]");
  }

  static void fillArray(int[] arr){
    Random rand = new Random();
    for (int i = 0; i < arr.length ; i++ ) {
      arr[i] = rand.nextInt(10);
    }
  }
  public static void main(String[] args) {

    /*
      TASK 1
    */

    String[] words = {"Ala ", " kota ", "ma", "ma", "a", " kot ", " Ale "};
    System.out.println(words[0] + words[2] + words[1] + words[4] + words[5] + words[3] + words[6]);

    /*
      TASK 2
    */
    {
      String str = "Ala ma kota";
      char[]  chrs = str.toCharArray();
      char expected = 'a';
      int counter = 0;
      for (int i = 0; i < chrs.length; i++)
        if (chrs[i] == expected)
          counter++;
      System.out.println("In given sentence \"" + str +  "\" letter '" + expected + "' appeared " + counter + " times.");
    }
    /*
      TASK 3
    */

    Random rand = new Random();

    int[] arr1 = new int[20];

    for (int i = 0; i < 19; i++) {
      arr1[i] = rand.nextInt(27) + 1;
    }
    arr1[(int)Math.ceil(arr1.length/2.0)] = -1;

    // System.out.print("[ ");
    // for (int i = 0; i < arr1.length - 1; i++) {
    //   System.out.print(arr1[i] + ", ");
    // }
    // System.out.print(arr1[arr1.length-1] + " ]");
    System.out.print("Task 3 array: ");
    printArray(arr1);
    
    /*
      TASK 4
    */

    int[] arr4a = new int[rand.nextInt(4) + 2];
    int[] arr4b = new int[rand.nextInt(4) + 2];
    int[] arr4c = new int[rand.nextInt(4) + 2];
    
    fillArray(arr4a);
    fillArray(arr4b);
    fillArray(arr4c);

    int[][] arr4d = new int[3][];
    arr4d[0] = arr4a;
    arr4d[1] = arr4b;
    arr4d[2] = arr4c;
    System.out.print("Task 4 latter array: ");
    printArray(arr4d[arr4d.length - 1]);

    /*
      TASK 4
    */

    int[][] arr5 = new int[8][8];

    for (int i = 0; i < arr5.length; i++) {
      fillArray(arr5[i]);
    }
    int countHelper1, expected1, countHelper2, expected2;


    boolean hasAtLeast3EqualValues = false;
    for (int i = 0,  k = arr5.length - 1; i < arr5.length; i++, k--) {
      countHelper1 = -1;
      countHelper2 = -1;
      expected1 = arr5[i][i];
      expected2 = arr5[i][k];
      // FROM THE LEFT
      for (int j = 0; j <  arr5.length; j++) {
        if (arr5[j][j] == expected1)
          countHelper1++;
        if (arr5[j][j] == expected2)
          countHelper2++;
      }
      // FROM THE RIGHT
      for (int m = 0, n = arr5.length - 1; m < arr5.length; m++, n--) {
        if (arr5[n][m] == expected1)
          countHelper1++;
        if (arr5[n][m] == expected2)
          countHelper2++;
      }
      if ((countHelper1 >= 3) || (countHelper2 >= 3)) {
        hasAtLeast3EqualValues = true;
      }
    }
    System.out.println("Diagonal has at least 3 equal values: " + hasAtLeast3EqualValues);
  }
}