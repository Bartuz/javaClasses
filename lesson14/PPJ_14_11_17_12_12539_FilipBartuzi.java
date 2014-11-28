import java.util.Random;

class PPJ_14_11_17_12_12539_FilipBartuzi {

  public static void main(String[] args) {
    
    final char sea = ' ', ship = 'X';
    final int dim = 10;
    final Random rand = new Random(System.currentTimeMillis());
    
    char[][] board = new char[dim][dim];

    for (int x = 0; x < dim; x++) {
      for (int y = 0; y < dim ; y++) {
        board[x][y] = sea;
      }
    }

    for (int i = 0; i < dim; i++) {
      int x, y;
      do {
        y = rand.nextInt(dim);
        x = rand.nextInt(dim);
      } while(board[x][y] == ship);
      board[x][y] = ship;
    }

    board[1][1] = 'X';

    // show(board);

	}

  // public static void draw(char[][] board){
  //   for (int x = 0; x < board.length; x++) {
  //     for (int y = 0; y < board.length; y++) {
  //       System.out.print(board[x][y]);
  //     }
  //     System.out.println();
  //   }
  // }
}