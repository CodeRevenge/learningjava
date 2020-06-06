import java.util.Scanner;

class Cat {
  int [][] logicTable;
  String [][] table;
  boolean turn;

  Cat() {
    logicTable = new int [3][3];
    table = new String [3][3];
    
    for (int i = 0; i < table.length; ++i) {
      for (int j = 0; j < table[i].length; ++j) {
        table[i][j] = " ";
      }
    }
    
    turn = true;
  }


  public void drawTable () {
    System.out.println("Table Cat");
    String tableString = "";

    for (int i = 0; i < table.length; ++i) {
      for (int j = 0; j < table[i].length; ++j) {
        tableString += table[i][j];
        
        if (j == 2) {
          tableString += "\n";
        } else {
          tableString += " | ";
        }
      }
      if (i != 2) {
        tableString += "---------\n";
        }
    }
    System.out.println(tableString);
  }

  public void play() {
    int x = 0, y = 0;

    if (this.turn) {
      Scanner in = new Scanner( System.in );
      while (true) {
        System.out.println("Position at X (1-3): ");
        if (in.hasNextInt())
          x = in.nextInt();
        
        if (x < 4 && x > 0) {
          x--;
          break;
        } else {
          System.out.println("Erro: Not a valid X position (" + x + ") set (1-3)");
        }
      }

      while (true) {
        System.out.println("Position at Y (1-3): ");
        if (in.hasNextInt())
          y = in.nextInt();
        
        if (y < 4 && y > 0) {
          y--;
          break;
        } else {
          System.out.println("Erro: Not a valid Y position (" + y + ") set (1-3)");
        }
      }

      table[x][y] = "o";


      // turn = false;
    }
  }

}


public class P3 {
  public static void main(String [ ] args) {
    Cat game = new Cat();
    game.drawTable();
    while (true) {
      game.play();
      game.drawTable();
    }
  }
}