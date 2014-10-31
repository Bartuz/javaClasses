class PPJ_09_10_27_12_12539_FilipBartuzi {
  public static void main(String[] args) {
    /*
      TASK 1
    */
    for (int i = 0; i <= 100 ; i++) {
      if ((i&1) == 0) {
        System.out.println(i);
      }
    }

    /*
      TASK 2    
    */
    int s = 0;

    // int i = 11;
    // while(i--) s+=i;
    // WHY JAVA CAN'T HAVE INT AS CONDITION?!?!?!
    {
      int i = 1;

      while(i <= 10) {
        s+=i;
        i++;
      }
    }

    /*
      TASK 3
    */

    int[] tab1 = {3, 2, 1, 4, 6};
    int[] tab2 = {1, 2, 4, 3, 4, 5};
    int[][] numbersWithCount = { {0}, {0}, {0}, {0}, {0}, {0} };
    for (int i = 0; i < tab1.length ; i++ ) {
      numbersWithCount[tab1[i]-1][0]++;
    }

    for (int i = 0; i < tab2.length ; i++) {
      int[] number = numbersWithCount[tab2[i]-1];
      if (number[0] == 0)
        continue;
      else 
        number[0]++;
    }

    // for (int i = 0; i < 7 ; i++ ) {
    //   System.out.println(numbersWithCount[i][0]);
    // }

    for (int i = 0; i < numbersWithCount.length ; i++) {
      int count = numbersWithCount[i][0], number = i+1;;
      if (count > 1)
        System.out.print("Number "+number+" exists in both tab1 and tab2");  
      if (count > 2) 
        System.out.println(" and it appeared "+count+" times.");
      else 
        System.out.println("");
    }
    
    /*
      TASK 4
    */

    for (int i = 1; i <= 100; i ++ ) {
      for (int j = 1 ; j <= 100 ; j++) {
        System.out.print("" + j*i + " ");
      }
      System.out.print("\n");
    }

    /* 
      TASK 5
    */

    int baseLength = 4;
    // TOP PART
    for (int i = baseLength; i > 0; i--) {
      // LEFT SIDE
      for (int j = 0; j < baseLength - i; j++ ) {
        System.out.print(" ");  
      }
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }
      // RIGHT SIDE
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }
      for (int j = 0; j < baseLength - i; j++ ) {
        System.out.print(" ");  
      }
      System.out.print("\n");
    }
    // ORPHAN
    for (int i = 0; i < baseLength ; i++ ) {
      System.out.print(" ");  
    }
    System.out.print("*");
    // BOTTOM PART
    for (int i = 0; i <= baseLength; i++) {
      // LEFT SIDE
      for (int j = 0; j < baseLength - i; j++ ) {
        System.out.print(" ");  
      }
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }
      // RIGHT SIDE
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }
      for (int j = 0; j < baseLength - i; j++ ) {
        System.out.print(" ");  
      }
      System.out.print("\n");
    }
  }
}