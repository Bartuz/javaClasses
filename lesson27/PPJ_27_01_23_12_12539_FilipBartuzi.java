import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

class PPJ_27_01_23_12_12539_FilipBartuzi {

  /*
     task 1 - put, get, charat()
  */

  public static HashMap<Character, Integer> charStat(String text){
    HashMap<Character, Integer> temp = new HashMap<Character, Integer>();
    for (int i = 0; i < text.length() ; i++) {
      char letter = text.charAt(i);
      int count = temp.containsKey(letter) ? (temp.get(letter) + 1) : 1;
      temp.put(letter, count);
    }
    return temp;
  }

  /*
    task 2
  */

  public static void show(HashMap<Character, Integer> contents){
    for (Character ch : contents.keySet())
      System.out.println(ch + ": " + contents.get(ch));
  }

  /*
    task 3
  */

  public static ArrayList<Character> cut(HashMap<Character, Integer> map, int limit){
    ArrayList<Character> temp = new ArrayList<Character>();
    for (Character ch : map.keySet())
      if(map.get(ch) > limit)
        temp.add(ch);
    return temp;
  }

	public static void main(String[] args) {
    HashMap<Character, Integer> task1 = charStat(",xzmnc,xzlaksjflkasjlkasd,mzxnbcnxzbcmnxzbcalskjdad;laks;flkxz;lkv;lcxk;");
    System.out.println("TASK 2: ");
    show(task1);
    System.out.println("TASK 3: ");
    System.out.println(cut(task1,1));
	}
}