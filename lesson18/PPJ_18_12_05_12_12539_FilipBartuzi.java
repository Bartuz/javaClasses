import java.util.Arrays;
class PPJ_18_12_05_12_12539_FilipBartuzi {

  static Rational arithmeticMean(Rational[] arr){
    Rational temp = Rational.ZERO;
    for (int i = 0; i < arr.length; i++) {
      temp = temp.add(arr[i]);
    }
    temp = temp.div(arr.length);
    temp.reduce();
    return temp;
  }

  static Rational reverse(Rational r){
    return Rational.ONE.div(r);
  }

  static void sort(Rational[] arr){
    for (int j = 0; j<arr.length; j++) {
      for (int k = 0; k < arr.length; k++){
        if (arr[j].lessThan(arr[k])) {
          Rational buffer = arr[j];
          arr[j] = arr[k];
          arr[k] = buffer; 
        }
      }
    }
  }

  static Rational harmonicMean(Rational[] arr){
    Rational denominator = new Rational(0,1);
    for (int i = 0; i < arr.length; i++) {
      denominator = denominator.add(reverse(arr[i]));
    }
    Rational solution = new Rational(arr.length, 1).div(denominator);
    solution.reduce();
    return solution;
  }

  static Rational max(Rational[] arr){
    Rational tempMax = arr[0];
    for (int i = 1; i < arr.length ; i++) {
      if (arr[i].greaterThan(tempMax)) {
        tempMax = arr[i];
      }
    }
    return tempMax;
  }

  static Rational min(Rational[] arr){
    Rational tempMin = arr[0];
    for (int i = 1; i < arr.length ; i++) {
      if (arr[i].lessThan(tempMin)) {
        tempMin = arr[i];
      }
    }
    return tempMin;
  }

  static void map(Rational[] arr){
    for (int i = 1; i < arr.length ; i++) {
      arr[i] = arr[i].mul(new Rational(i, 1));
    }
  }


	public static void main(String[] args) {
    
    /*
      Task 1
    */
    Rational oneOverTwo = new Rational(1,2);
    Rational twoOverThree = new Rational(2,3);
    Rational[] task1 = {oneOverTwo, twoOverThree};
    System.out.println("Arithmetic Mean " + arithmeticMean(task1));
    System.out.println("Harmonic Mean " + harmonicMean(task1));

    /*
      Task 2
    */

    Rational[] task2 = {oneOverTwo, oneOverTwo, oneOverTwo, oneOverTwo, oneOverTwo};
    Rational sum = Rational.ZERO;
    Rational product = Rational.ONE;
    for (int i = 0; i < task2.length; i++) {
      sum = sum.add(task2[i]);
      product = product.mul(task2[i]);
    }
    sum.reduce();
    product.reduce();
    System.out.println("Summ " + sum);
    System.out.println("Product " + product);


    /*
      Task 3
    */

    Rational[] task3 = {Rational.ZERO, oneOverTwo, Rational.ONE, oneOverTwo, twoOverThree};
    System.out.println("Minumum " + min(task3));
    System.out.println("Max " + max(task3));


    /*
      TASK 4
    */

    Rational[] task4 = {Rational.ZERO, oneOverTwo, Rational.ONE, oneOverTwo, twoOverThree};
    sort(task4);
    System.out.println(Arrays.toString(task4));

    /*
      TASK 5
    */

    Rational[] task5 = {Rational.ZERO, Rational.ONE, oneOverTwo, oneOverTwo, twoOverThree};
                      //      0             1             2           3         4 
    map(task5);
    System.out.println(Arrays.toString(task5));
	}
}