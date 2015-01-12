class PPJ_24_01_12_12_12539_FilipBartuzi {
	public static void main(String[] args) {
    /*
      TASK 2
    */
    Candy candy = new Candy("Coco", 24.4);
    System.out.println(candy);
    Candy candy2 = new Candy("Durian", 13.1);
    Candy candy3 = new Candy("Pistachio", 23.2);
    System.out.println(candy2);
    System.out.println("-------------- END OF TASK 1 -----------------");
    /*
      Task 3
    */

    Container container = new Container();

    container.load(candy);
    container.load(candy2);
    container.load(candy3);

    container.show();
	}
}

class Candy {

  /*
    TASK 1
  */

  private String taste;
  private double weight;

  public Candy(String taste, double weight){
    this.taste = taste;
    this.weight = weight;
  }

  public String toString(){
    return "Candy of taste " + taste + " and weight " + weight + " g.";
  }
  public double getWeight(){
    return weight;
  }

}


class Container {
  /*
  TASK 2
*/
  private Candy[] contents;
  private int quantity;
  private double weight;

  private static final int DEFAULT_CANDIES_AMOUNT = 10;
  public Container(){
    this.quantity = 0;
    this.weight = 0;
    this.contents = new Candy[DEFAULT_CANDIES_AMOUNT];
    for (int i = 0; i < DEFAULT_CANDIES_AMOUNT; i++) {
      this.contents[i] = new Candy("Rambutan", 10);
      this.quantity++;
      this.weight += this.contents[i].getWeight();
    }
  }

  /*
    Task 3
  */

  public void load(Candy c){
    Candy[] temp = new Candy[++this.quantity];
    temp[0] = c;
    this.weight += c.getWeight();
    for (int i = 1; i < quantity; i++) {
      temp[i] = contents[i-1];
    }
    this.contents = temp;
  }

  public int quantity(){
    if (quantity != contents.length) {
      this.quantity = contents.length;
    }
    return quantity;
  }
  public double totalWeight(){
    double total = 0;
    for (int i = 0; i < contents.length; i++) {
      total += contents[i].getWeight();
    }
    return total;
  }

  public void show(){
    System.out.println("Container with " + quantity + " candies and total weight of " + weight + " g.");
    for (int i = 0; i < contents.length;i++) {
      System.out.println("" + (i + 1) + ". " + contents[i]);
    }
  }
}