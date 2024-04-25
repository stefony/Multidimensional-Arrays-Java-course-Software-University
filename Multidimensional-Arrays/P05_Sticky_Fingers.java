import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P05_Sticky_Fingers {
    public static void main(String[] args) throws IOException {
        //    Scanner scanner = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int fieldSize = Integer.parseInt(br.readLine());
        String[] movingCommands = br.readLine().split(",");
        String[][] field = new String[fieldSize][fieldSize];

        int rowIndex = -1;
        int columnIndex = -1;

        for (int i = 0; i < fieldSize; i++) {
            String[] row = br.readLine().split(" ");
            for (int j = 0; j < fieldSize; j++) {
                field[i][j] = row[j];

                if (field[i][j].equals("D")) {
                    rowIndex = i;
                    columnIndex = j;
                }
            }
        }
        int totalMoney = 0;
        boolean caught = false;


        for (int i = 0; i < movingCommands.length; i++) {

            switch (movingCommands[i]) {
                case "up":
                    if (rowIndex - 1 >= 0) {
                        field[rowIndex][columnIndex] = "+";
                        rowIndex--;
                    } else {
                        System.out.println("You cannot leave the town, there is police outside!");
                    }
                    break;
                case "down":
                    if (rowIndex + 1 < fieldSize) {
                        field[rowIndex][columnIndex] = "+";
                        rowIndex++;
                    } else {
                        System.out.println("You cannot leave the town, there is police outside!");
                    }
                    break;
                case "left":
                    if (columnIndex - 1 >= 0) {
                        field[rowIndex][columnIndex] = "+";
                        columnIndex--;
                    } else {
                        System.out.println("You cannot leave the town, there is police outside!");
                    }
                    break;
                case "right":
                    if (columnIndex + 1 < fieldSize) {
                        field[rowIndex][columnIndex] = "+";
                        columnIndex++;
                    } else {
                        System.out.println("You cannot leave the town, there is police outside!");
                    }
                    break;
            }
            if (field[rowIndex][columnIndex].equals("P")) {
                System.out.printf("You got caught with %d$, and you are going to jail.%n", totalMoney);
                field[rowIndex][columnIndex] = "#";
                caught = true;
                break;
            }
            if (field[rowIndex][columnIndex].equals("$")) {
                System.out.printf("You successfully stole %d$.%n", rowIndex * columnIndex);
                totalMoney += rowIndex * columnIndex;

            }
            field[rowIndex][columnIndex] = "D";

        }
        if (!caught) {
            System.out.printf("Your last theft has finished successfully with %d$ in your pocket.%n", totalMoney);
        }

        for (int i = 0; i < fieldSize; i++) {
            System.out.println(String.join(" ", field[i]));
        }
    }

}
