class Rational {

  public static final Rational ZERO = new Rational(0, 1);
  public static final Rational ONE = new Rational(1, 1);

  static int getValueFromUser(String type){
    String data = javax.swing.JOptionPane.showInputDialog("Enter a " + type);
    return Integer.parseInt(data);
  }
  public static void main(String[] args) {

    try {
      Rational oneOverThree = new Rational();
      Rational twoOverThree = new Rational();
    } catch(IllegalArgumentException e) {
      System.out.println(e);
    }
  }

  private int numerator;
  private int denominator;

  public Rational(int numerator, int denominator){
    this.numerator = numerator;
    this.denominator = denominator;
    if (denominator == 0) {
      throw new IllegalArgumentException("Zero denominator");
    }
  }

  public Rational(){
    this.numerator = getValueFromUser("numerator");
    this.denominator = getValueFromUser("denominator");
  }

  public void reduce(){
    int gcd = gcd(this.numerator, this.denominator);
    this.numerator /= gcd;
    this.denominator /= gcd;
  }

  public Rational mul(Rational arg){
    int numerator = this.numerator * arg.numerator;
    int denominator = this.denominator * arg.denominator;
    return new Rational(numerator, denominator);
  }

  public Rational add(Rational arg){
    int numerator = this.numerator * arg.denominator + (this.denominator * arg.numerator);
    int denominator = this.denominator * arg.denominator;
    return new Rational (numerator, denominator);
  }

  public Rational sub(Rational arg){
    int numerator = this.numerator * arg.denominator - (this.denominator * arg.numerator);
    int denominator = this.denominator * arg.denominator;
    return new Rational (numerator, denominator);
  }

  public Rational div(Rational arg){
    int numerator = this.numerator * arg.denominator;
    int denominator = this.denominator * arg.numerator;
    return new Rational (numerator, denominator);
  }

    public Rational mul(int val){
    int numerator = this.numerator * val;
    int denominator = this.denominator * 1;
    return new Rational(numerator, denominator);
  }

  public Rational add(int val){
    int numerator = this.numerator * 1 + (this.denominator * val);
    int denominator = this.denominator * 1;
    return new Rational (numerator, denominator);
  }

  public Rational sub(int val){
    int numerator = this.numerator * 1 - (this.denominator * val);
    int denominator = this.denominator * 1;
    return new Rational (numerator, denominator);
  }

  public Rational div(int val){
    int numerator = this.numerator * 1;
    int denominator = this.denominator * val;
    return new Rational (numerator, denominator);
  }



  private static int compare(Rational larg, Rational rarg){
    return larg.numerator * rarg.denominator - larg.denominator * rarg.numerator;
  }

  public boolean equals(Rational arg){
    return Rational.compare(this, arg) == 0;
  }

  public boolean lessThan(Rational arg){
    if (this.denominator * arg.denominator < 0) {
      return Rational.compare(this, arg) > 0;
    } else {
      return Rational.compare(this, arg) < 0;
    }
  }

  public boolean lessThanOrEqual(Rational arg){
    return lessThan(arg) || equals(arg);
  }

  public boolean greaterThan(Rational arg){
    if (this.denominator * arg.denominator < 0) {
      return Rational.compare(this, arg) > 0;
    } else {
      return Rational.compare(this, arg) < 0;
    }
  }

  public boolean greaterThanOrEqual(Rational arg){
    return equals(arg) || greaterThan(arg);
  }

  public String toString(){
    if (this.numerator == 0) 
      return "0";
    return (this.numerator == this.denominator) ? ("" + this.numerator) : ("" + this.numerator + "/" + this.denominator);
  }

  private int gcd(int a, int b){
    if (a == 0)
      return 1;
    while(a != b){
      if (a > b)
        a-=b;
      else
        b-=a;
    }
    return a;
  }

}