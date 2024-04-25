import java.util.Scanner;

public class P06_Bomb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        String[] directions = scanner.nextLine().split(",");
        String[][] matrix = new String[size][size];

        int countBomb = 0;
        int bomb = 0;
        fillMatrix(matrix, scanner);

        int rowStart = 0;
        int colStart = 0;
        boolean isEnd = false;
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (matrix[row][col].equals("s")) {
                    rowStart = row;
                    colStart = col;
                    break;
                }

            }
        }
        for (String drection : directions) {
            switch (drection) {

                case "left":
                    if (colStart - 1 < 0) {
                        break;
                    }else {
                        matrix[rowStart][colStart] = "+";
                        colStart--;
                    }
                    break;

                case "right":
                    if (colStart + 1 >= size) {
                        break;
                    }else {

                        colStart++;
                    }
                    break;
                case "up":
                    if (rowStart - 1 < 0) {
                        break;
                    }else {
                        matrix[rowStart][colStart] = "+";
                        rowStart--;
                    }
                    break;

                case "down":
                    if (rowStart + 1 >= size) {
                        break;
                    }else {
                        matrix[rowStart][colStart] = "+";
                        rowStart++;
                    }
                    break;
            }
            String current = matrix[rowStart][colStart];
            if (current.equals("B")) {
                System.out.println("You found a bomb!");
                bomb++;
                matrix[rowStart][colStart] = "+";
            }else if (current.equals("e")){
                isEnd=true;
                break;
            }


        }
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                if (matrix[row][col].equals("B")) {
                    countBomb++;
                }
            }
        }
        if (isEnd){
            System.out.printf("END! %d bombs left on the field",countBomb);
        }else if (countBomb==0) {
            System.out.println("Congratulations! You found all bombs!");
        } else {
            System.out.printf(" %d bombs left on the field. Sapper position: (%d,%d)", countBomb, rowStart, colStart);
        }

    }
    private static void fillMatrix (String[][]matrix, Scanner scanner){
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = scanner.nextLine().split("\\s+");
        }
    }

}
