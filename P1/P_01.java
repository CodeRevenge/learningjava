/**
  Java: Practice 01
  Autor: César Arley Ojeda Escobar
  Date: 05/06/2020
 */

class Operation {
  private double x;
  private double y;

  Operation(double x, double y) {
    this.x = x;
    this.y = y;
  }

  Operation() {
    this(0, 0);
  }

  public double operate(char operator) {
    return operate(x, y, operator);
  }

  public double operate(double x, double y, char operator) {
    try {
      // if (operator.length > 1) throw new Exception("Not a valid operator")
      switch(operator) {
        case '+':
          return x + y;
        case '-':
          return x - y;
        case '*':
          return x * y;
        case '/':
          return x / y;
        default:
          throw new Exception("Invalid operator");
      }
    } catch (Exception e ) {
      System.out.println(e);
      return 0;
    }
  }

  public double max(double x, double y) {
    return x > y ? x : y;
  }

  public void setX(double x) { this.x = x; };

  public double getX() { return x; };

  public void setY(double y) { this.y = y; };

  public double getY() { return y; };

}

class Int {
  private int self;

  Int(int self) {
    this.self = self;
  }

  public int _intPP() {
    // int++ -> Post
    int original = self;
    self = self + 1;
    return original;
  }

  public int _PPint() {
    // ++int -> Pre
    self = self + 1;
    return self;
  }

  int _int() {
    return self;
  }

  void setInt(int self) {
    this.self = self;
  }
}


public class P_01 {

  public static void main(String [ ] args) {
    try {

      // Explaining pre and post adding with mono operators.

      // Int m = new Int(0), n = new Int(0);
      // System.out.println("A: " + m._int() + ", B: " + n._int());
      // // "A: 0, B: 0"
      // System.out.println("A: " + m._intPP() + ", B: " + n._PPint());
      // // "A: 0, B: 1"
      // System.out.println("A: " + m._intPP() + ", B: " + n._PPint());
      // // "A: 1, B: 2"
      // System.out.println("A: " + m._int() + ", B: " + n._int());
      // // "A: 2, B: 2"

      // System.out.println("------------------");
      // int a = 0, b = 0;
      // System.out.println("A: " + a + ", B: " + b);
      // // "A: 0, B: 0"
      // System.out.println("A: " + a++ + ", B: " + ++b);
      // // "A: 0, B: 1"
      // System.out.println("A: " + a++ + ", B: " + ++b);
      // // "A: 1, B: 2"
      // System.out.println("A: " + a + ", B: " + b);
      // // "A: 2, B: 2"


      //  Operations

      // if (args.length < 3) throw new Exception("You miss an argument");
      // if (args[2].length() > 1) throw new Exception ("Invalid operator");

      // String arg01 = args[0];
      // String arg02 = args[1];
      // char arg03 = args[2].charAt(0);

      // int x = Integer.parseInt(arg01);
      // int y = Integer.parseInt(arg02);

      // Operation op = new Operation();

      // System.out.println("Result of " + x + arg03 + y + ": " + op.operate(arg03));

      // System.out.println("Result of " + x + arg03 + y + ": " + op.operate(x, y, arg03));


      // Max

      String result = "From [";
      // double [ ] nums = [];

      Int a, b;

      a = new Int(15);
      b = null;

      System.out.println("A: " + a._int() + ", B: " + b._int());

      a.setInt(5);

      System.out.println("A: " + a._int() + ", B: " + b._int());

      for (int i = 0; i < args.length; i++) {

      


        result = result + args[i];
        if (i == args.length - 1) {
          result = result + "]";
        } else {
          result = result + ", ";
        }
      }

      System.out.println(result);


    } catch (Exception e) {
      System.out.println(e);
    }
  }

}