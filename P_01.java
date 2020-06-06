/**
  Java: Practice 01
  Autor: César Arley Ojeda Escobar
  Date: 05/06/2020
 */

class Operation {
  double x;
  double y;

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

  public void setX(double x) { this.x = x; };
  
  public double getX() { return x; };
  
  public void setY(double y) { this.y = y; };
  
  public double getY() { return y; };

}


public class P_01 {
  
  public static int add(int x, int y) {
    return x + y;
  }

  public static void main(String [ ] args) {
    try {
      if (args.length < 3) throw new Exception("You miss an argument");
      if (args[2].length() > 1) throw new Exception ("Invalid operator");

      String arg01 = args[0];
      String arg02 = args[1];
      char arg03 = args[2].charAt(0);
      
      int x = Integer.parseInt(arg01);
      int y = Integer.parseInt(arg02);

      Operation op = new Operation();

      System.out.println("Result of " + x + arg03 + y + ": " + op.operate(arg03));

      System.out.println("Result of " + x + arg03 + y + ": " + op.operate(x, y, arg03));


    } catch (Exception e) {
      System.out.println(e);
    } 
  }

}