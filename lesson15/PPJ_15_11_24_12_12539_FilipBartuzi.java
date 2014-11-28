class PPJ_15_11_24_12_12539_FilipBartuzi {
  
    public static boolean isPal(char[] text, int index){
      if(index > text.length / 2 - 1 )
        return true; 
      if(text[index] == text[text.length-1-index])
        return isPal(text, index+1);
      else
        return false;
    }


  static double fact(int x){
     return (x <= 1) ? 1 : fact(x - 1) * x;
  }

  static double factTail(int x, int accumulator) {
    return (x <= 1) ? accumulator : factTail(x - 1, x * accumulator);
  }

  static void reverser(char[] text, int index){
    if (index <= (text.length/2 - 1)) {
      char temp = text[index];
      text[index] = text[text.length - 1 - index];
      text[text.length - 1 - index] = temp;
      reverser(text, index+1);
    }
  }

  static char nextCharacter(char c){
    if(c == 'x') 
      return 'o';
    else
      return 'x';
  }

  static boolean isDiagonal(int[][] arr){
    for (int i = 0; i < arr.length; i++) {
      if (arr[i].length != arr.length)
        return false;
      if (arr[i][i] != 0)
        return false;
    }
    return true;
  }

  static void encrypt(char[] text){
    System.out.print("Encrypting "+ String.valueOf(text)  + "\nEncrypted: ");
    for (int i = 0; i < text.length; i++) {
      text[i] += i;
      System.out.print(text[i]);
    }
    System.out.println();
  }
  static void decrypt(char[] cypher){
    System.out.print("Decrypting " + String.valueOf(cypher)  + "\nDecrypted: ");
    for (int i = 0; i < cypher.length; i++) {
      cypher[i] -= i;
      System.out.print(cypher[i]);
    }
    System.out.println();
  }

  static void task3(char[] text){
    System.out.println("Given text: " + String.valueOf(text));
    encrypt(text);
    decrypt(text);
  }
  
  static void sqr(int x, char initialCharacter){
    char actualCharacter = initialCharacter;
    for(int i = 0; i < x; i++){
      for(int j = 0; j < x; j++){
        System.out.print(actualCharacter);
        actualCharacter = nextCharacter(actualCharacter);
      }
      System.out.println();
    }
  }
  
  public static void main(String[] args) {
    sqr(3, 'o');
    int[][] arrayTrue = {{0,1,2}, {1,0,2}, {1,2,0}};
    int[][] arrayFalse = {{1,1,2}, {1,0,2}, {1,2,0}};
    System.out.println(isDiagonal(arrayTrue));
    System.out.println(isDiagonal(arrayFalse));
    char[] code = { 'a', 'b', 'c'};
    task3(code);
    System.out.println(fact(3));
    fact(10); 
    factTail(10, 1);
    char[] toReverser = { 'a', 'b', 'c', 'd'};
    System.out.println("Before reverser: " + String.valueOf(toReverser));
    reverser(toReverser, 0 );
    System.out.println("After reverser: " + String.valueOf(toReverser));
    char[] aPal = { 'a', 'b', 'b', 'a'};
    char[] notAPal = { 'a', 'b', 'b', 'c'};
  }
}
