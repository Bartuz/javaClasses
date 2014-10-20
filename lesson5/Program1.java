class Program1 {
  public static void main(String[] args){
    System.out.println("Hello PJATK");
    boolean b = true;
    int iMax = Integer.MAX_VALUE;
    int iMin = Integer.MIN_VALUE;
    double dMax = Double.MAX_VALUE;
    double dMin = dMax * (-1)
    double fMax = Float.MAX_VALUE;
    double fMin = Float.MIN_VALUE;
    char c = 'a';
    char c2 = 'B';
    System.out.println(
      "\tMin\t\t\tMax\n" +
      "int\t" + iMin + "\t\t" + iMax + '\n' +
      "double\t" + dMin + "\t\t" + dMax + '\n' +
      "float\t" + fMin + "\t" + fMax + '\n' +
      "int\t" + iMin + "\t\t" + iMax + '\n'
    );
    int iOne = 1;
    double dOne = 1.0d;
    System.out.println("char + int is char: " + (c += 1));
    System.out.println("int + char is int: " + (iOne += 'c'));
    System.out.println("double + float  is double: " + (dOne += Float.MAX_VALUE));
    iOne = 1;
    System.out.println("int + byte is int: " + (iOne += Byte.MAX_VALUE));
  }
}

