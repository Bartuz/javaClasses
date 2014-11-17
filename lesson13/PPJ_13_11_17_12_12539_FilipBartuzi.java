import java.util.*
import java.io.*

class PPJ_13_11_17_12_12539_FilipBartuzi {

  static readInt(){
    while(true){
      String input = System.console().readLine();
      try {
        return Integer.parseInt(input)
      } catch (Exception e){
        System.err.println("Not an integer: " + input);
      }
    }
  }
	
  static String readString(){
    return System.console().readLine();
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
	}
}