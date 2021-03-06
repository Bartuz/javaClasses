public class NoughtsAndCrosses {

  public static void main(String[] args){
    new NoughtsAndCrosses().play();
  }

  private int[][] board = new int[3][3];
  private static final char[] leftScale = {'A', 'B', 'C'};
  public NoughtsAndCrosses (){
  }    

  public void play(){
    do {
      displayBoard();
      getMove();
      computerMove();
    }while(!gameOver());
    System.out.println("We've got the winner!");
  }

  public void displayBoard(){
    System.out.println("    1   2   3\n");
    for (int i = 0; i < 3; i++) {
      System.out.print(leftScale[i] + "   ");
      for (int j = 0; j < 3; j++) {
        System.out.print(this.board[i][j] + (j == 2 ? "" :  " | "));
      }
      if (i != 2) {
        System.out.print("\n    _________"); 
      }
      System.out.println();
    }
    System.out.println("\n----------------------------");
  }



  private void getMove(){
    int[] cords = null;
    do {
      String userInput = javax.swing.JOptionPane.showInputDialog("Select a field (e.g. A2)");
      cords = stringToCords(userInput);
    } while(this.board[cords[0]][cords[1]] != 0);
    this.board[cords[0]][cords[1]] = 1;
  }

  private int[] stringToCords(String data){
    int leftCord = data.charAt(0) - 'A';
    int topCord = data.charAt(1) - '1';
    return new int[] {leftCord, topCord};
  }

  private void computerMove(){
    int leftCord, topCord;
    do {
      leftCord = (int)(Math.random() * 3);
      topCord = (int)(Math.random() * 3);
    } while(this.board[leftCord][topCord] != 0);
    this.board[leftCord][topCord] = -1;
  }

  private boolean gameOver(){
    return isWinner() || !isThereEmptyField();
  }    

  private boolean isThereEmptyField(){
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        if (this.board[i][j] == 0) 
          return true;
      }
    }
    return false;
  }

  private boolean isWinner(){
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        this.board[i][j]
      }
    }
  }

}