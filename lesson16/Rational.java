class Rational {
  public static void main(String[] args) {
    Rational oneOverThree = new Rational(1, 3);
    Rational twoOverThree = new Rational(2, 3);
    Rational r1 = oneOverThree.mul(oneOverThree);
    Rational r2 = oneOverThree.mul(twoOverThree);

    Rational r3 = oneOverThree.div(oneOverThree);
    Rational r4 = oneOverThree.div(twoOverThree);

    Rational r5 = oneOverThree.add(oneOverThree);
    Rational r6 = oneOverThree.add(twoOverThree);

    Rational r7 = oneOverThree.sub(oneOverThree);
    Rational r8 = oneOverThree.sub(twoOverThree);

    System.out.println("Solution of " + oneOverThree + "* " + oneOverThree + " = " + r1);
    System.out.println("Solution of " + oneOverThree + "* " + twoOverThree + " = " + r2);
    System.out.println("Solution of " + oneOverThree + "/ " + oneOverThree + " = " + r3);
    System.out.println("Solution of " + oneOverThree + "/ " + twoOverThree + " = " + r4);
    System.out.println("Solution of " + oneOverThree + "+ " + oneOverThree + " = " + r5);
    System.out.println("Solution of " + oneOverThree + "+ " + twoOverThree + " = " + r6);
    System.out.println("Solution of " + oneOverThree + "- " + oneOverThree + " = " + r7);
    System.out.println("Solution of " + oneOverThree + "- " + twoOverThree + " = " + r8);
  }

  private int numerator;
  private int denominator;

  public Rational(int numerator, int denominator){
    this.numerator = numerator
    this.denominator = denominator
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
    int denominator = this.denominator * arg.nominator;
    return new Rational (numerator, denominator);
  }

  private static int compare(Rational larg, Rationa rarg){
    return this.numerator * arg.denominator - this.denominator * arg.numerator;
  }

  public boolean equals(Rational arg){
    return Rational.compare(this, arg) == 0
  }

  public boolean lessThan(Rational arg){
    if (this.denominator * arg.denominator < 0) {
      return Rational.compare(this, arg) > 0;
    } else {
      return Rational.compare(this, arg) < 0;
    }
  }

  public boolean lessThanOrEqual(Rational arg){
    if (this.denominator * arg.denominator < 0) {
      return Rational.compare(this, arg) >= 0;
    } else {
      return Rational.compare(this, arg) <= 0;
    }
  }

  public boolean greaterThan(Rational arg){
    if (this.denominator * arg.denominator < 0) {
      return this.numerator * arg.denominator < this.denominator * arg.numerator;
    } else {
      return this.numerator * arg.denominator > this.denominator * arg.numerator;
    }
  }

  public boolean greaterThanOrEqual(Rational arg){
    return equals(arg) || greaterThan(arg)
  }

  public String toString(){
    if (this.numerator == 0) 
      return "0";
    return (this.numerator == this.denominator) ? ("" + this.numerator) ("" + this.numerator + "/" + this.denominator);
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