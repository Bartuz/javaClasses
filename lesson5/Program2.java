class Program2 {
  static int rand() {
    int number = 4;
    return 4;
  }
  public static void main(String[] args) {
    int a = 1;
    if (true) System.out.println("a: " + a);
    for (int i = 0; i < 2; i++) {
      int x = 0;
      System.out.println("x: " + x);
      System.out.println("a: " + a);
      if (i == 1) {
        a = 2;
        System.out.println("a (when i==1): " + a);
      }
      System.out.println("a: (after for loop)" + a);
    }
    // System.out.println(i);
    // System.out.println(x); 
    {
      a = 3;
      int b = 2;
      System.out.println("b: " + b);
    }
    System.out.println("a: (after {}): " + a);
    // System.out.println(b);
    System.out.println(rand());
    // System.out.println(number);
    int number = rand();
    System.out.println("Number: " + number);
  }
}