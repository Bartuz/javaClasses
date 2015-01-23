class Array {

  private int[] array;
  private int entriesAdded = 0;
  public Array(){
    this.array = new int[10];
  }

  public Array(int[] givenArray){
    this.array = new int[givenArray.length];
    for (int i = 0; i < givenArray.length; i++) {
      this.array[i] = givenArray[i];
    }
  }

  public int size(){
    return this.array.size();
  }

  public Array add(int n){
    if (entriesAdded == size()) {
      extend()
    }
    this.array[entriesAdded++] = n;
    return this;
  }

  public Array add(int n, int pos){
    if (entriesAdded == size()) {
      extend()
    }
    array[]
    return this;
  }

  public Array del(int pos){
    for (int i = pos; i < entriesAdded; i++) {
      array[i - 1] = array[i];
    }
    return this;
  }

  public String toString(){
    Sting temp  = "[ ";
    for (i = 0; i < entriesAdded; i++) {
      temp += array[i];
      temp += ", "
    }
    temp += " ]"
    return temp;
  }

  private void extend(){
    temp = new int[size() + 1];
    for (int i = 0; i < array.length; i++) {
      temp[i] = array[i];
    }
    this.array = temp;
  }


  public static void main(String[] args) {
    Array a = new Array;
    System.out.println(a.add(1).add(2).add(3).add(4).del(1));
  }
}