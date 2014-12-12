class PPJ_19_12_12_12_12539_FilipBartuzi {
	
  public String string;

  public PPJ_19_12_12_12_12539_FilipBartuzi(String string){
    this.string = string;
  }
  
  public void changeCase(){
    char[] tempString = new char[this.string.length()];
    for (int i = 0; i < tempString.length ; i++) {
      char letter = this.string.charAt(i);
      if (Character.isUpperCase(letter))
        tempString[i] = Character.toLowerCase(letter);
      else
        tempString[i] = Character.toUpperCase(letter);
    }
    this.string = new String(tempString);
  }

  public boolean isPal(String s){
    if (s.length() != this.string.length())
      return false;
    for (int i = 0, j = this.string.length()-1; i < this.string.length(); i++,j--) {
      if (this.string.charAt(i) != s.charAt(j)) {
        return false;
      }
    }
    return true;
  }

  public boolean isIncluded(String s){
    return ((this.string.toLowerCase().contains(s.toLowerCase())) || (this.string.toLowerCase().contains(new StringBuilder(s).reverse().toString())));
  }

  public static String enterString(){
    return javax.swing.JOptionPane.showInputDialog("Enter a word");
  }

  private boolean isSuffix(String s){
    int length1 = s.length();
    int length2 = this.string.length();
    return (this.string.substring(length2 - length1, length2).equals(s));
  }

  private boolean isPrefix(String s){
    int length1 = s.length();
    return (this.string.substring(0, 0 + length1).equals(s));
  }

  public int prefixOrSuffix(String s){
    if (isPrefix(s)) {
      return -1;
    } else if (isSuffix(s)){
      return 1;
    } else {
      return 0;
    }
  }

  public static void main(String[] args) {
      
    /*
      TASK 1
    */

    PPJ_19_12_12_12_12539_FilipBartuzi s = new PPJ_19_12_12_12_12539_FilipBartuzi(enterString());
    s.changeCase();
    System.out.println(s.string);

    /*
      TASK 2
    */


    /*
      TASK 3
    */

    PPJ_19_12_12_12_12539_FilipBartuzi task3 = new PPJ_19_12_12_12_12539_FilipBartuzi(enterString());
    System.out.println(task3.isPal(enterString()));
    System.out.println(task3.isPal(enterString()));

    /*
      TASK 4
    */

    System.out.println("task 4:");
    PPJ_19_12_12_12_12539_FilipBartuzi task4 = new PPJ_19_12_12_12_12539_FilipBartuzi(enterString());
    System.out.println(task4.isIncluded(enterString()));
    System.out.println(task4.isIncluded(enterString()));

    /*
      TASK 5
    */

    System.out.println("task 5:");
    PPJ_19_12_12_12_12539_FilipBartuzi task5 = new PPJ_19_12_12_12_12539_FilipBartuzi(enterString());
    System.out.println(task5.prefixOrSuffix(enterString()));
    System.out.println(task5.prefixOrSuffix(enterString()));
    System.out.println(task5.prefixOrSuffix(enterString()));

	}
}