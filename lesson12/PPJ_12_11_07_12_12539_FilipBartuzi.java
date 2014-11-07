class PPJ_12_11_07_12_12539_FilipBartuzi {
	
  // TASK 1

  static void show(int a){
    System.out.println("I'm showing " + a);
  }

  // TASK 2;

  static void modifyValue(int a){
    System.out.println("---Inside Method---");
    System.out.println("\tBefore modify: " + a);
    a*=5;
    System.out.println("\tAfter modify: " + a);
    System.out.println("---End of Method---");
  }

  // TASK 3

  static int countChars(char[] a){
    int count = 0;
    for (int i = 0; i < a.length; i++)
      count++;
    return count;
  }

  // TASK 4;

  static void display(char[][] a){
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length ; j++) {
        System.out.print(a[i][j]);
      }
      System.out.println();
    }
  }

  static void fillRow(char[][] a, int row, char c) {
    for (int i = 0; i < a[row].length; i++)
      a[row][i] = c;
  }

  static void fillCol(char[][] a, int col, char c) {
    for (int i = 0; i < a.length; i++)
      a[i][col] = c;
  }

  static void fillRowFromTo(char[][] a, int row, int from, int to, char c){
    for (int i = from; i <= to; i++)
      a[row][i] = c;
  }

  static void fillColFromTo(char[][] a, int col, int from, int to, char c){
    for (int i = from; i <= to; i++)
      a[i][col] = c;
  }

  public static void main(String[] args) {
      
    // TASK 1;
    int q = 3;
    show(q);

    // TASK 2;

    int v = 5;
    System.out.println("Calling modifyValue with v == " + v);
    modifyValue(v);
    System.out.println("After modifyValue call v == " + v);

    /*
      EXPLANATION: When we pass int (and other primitives also) java pass it by value not by refence
    */

    // TASK 3;

    char[] chrs = "Ala ma kota".toCharArray();
    System.out.println("Length of char[] = Ala ma kota is : "  + countChars(chrs) );

    // TASK 4;

    char[][] board = new char [20][20];

    for (int i = 0; i < board.length ; i++)
      fillRow(board, i, '.');

    // for (int i = 0; i < 3*2; i+=2) {
    //   fillColFromTo(board, i, 0, i, '+');
    //   fillRowFromTo(board, board.length - 1 - i, i, board.length - i, '+');
    // }

    for (int i = 0, l = board.length; i < l/2; i+=2) {
      fillColFromTo(board, i, i <= 2 ? 0 : i - 2, board.length - i - 1, '+');
      fillRowFromTo(board, board.length -1 - i, i, board.length - 1 - i, '+');
      fillColFromTo(board, l - 1 - i , i, board.length - (i) - 1, '+');
      fillRowFromTo(board, i, i + 2, l - 1 - i - 1, '+'); 
    }
    fillRowFromTo(board, board.length/2 - 1, board.length/2, board.length/2, '0');

    display(board);

	}
}