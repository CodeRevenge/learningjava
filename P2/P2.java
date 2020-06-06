import java.util.ArrayList;

class ArrayOps {
  private ArrayList <Integer> numbers;

  ArrayOps(ArrayList <Integer> numbers) {
    this.numbers = numbers;
  }

  int min() {
    int min = numbers.get(0);

    for (int item : numbers)
      min = item < min ? item : min;

    return min;
  }

  private int _minRecursive (int min, int index) {
    int t_min = numbers.get(index) < min ? numbers.get(index) : min;
    if (index == numbers.size() - 1)
      return t_min;
    return _minRecursive(t_min, ++index);
  }

  int minRecursive() {
    return _minRecursive(numbers.get(0), 0);
  }

  int max() {
    int max = numbers.get(0);

    for (int item : numbers)
      max = item > max ? item : max;

    return max;
  }

  double mean() {
    int sum = 0;
    
    for (int item : numbers)
      sum += item;

    return sum / numbers.size();
  }
}

public class P2 {

  public static void main(String [ ] args) {

    ArrayList <Integer> numbers = new ArrayList<Integer>();


    for (String arg : args)
      numbers.add(Integer.parseInt(arg));

    
    ArrayOps ops = new ArrayOps(numbers);

    System.out.println("From " + numbers + " the min is: " + ops.min());
    System.out.println("From " + numbers + " the minRec is: " + ops.minRecursive());
    System.out.println("From " + numbers + " the max is: " + ops.max());
    System.out.println("From " + numbers + " the mean is: " + ops.mean());

  }

}