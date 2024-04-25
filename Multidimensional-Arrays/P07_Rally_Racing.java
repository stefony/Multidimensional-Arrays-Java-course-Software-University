import java.util.Scanner;

public class P07_Rally_Racing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        String carNum = scanner.nextLine();
        String [][]matrix = new String[size][size];

        fillMatrix(matrix,scanner);

        int km = 0;
        boolean inFinish= false;
        int rowCar = 0;
        int colCar = 0;
        matrix[rowCar][colCar]= "C";

        String command = scanner.nextLine();
        while (!command.equals("End")){
            matrix[rowCar][colCar]=".";
            if (command.equals("left")){
                colCar--;
            }else if (command.equals("right")){
                colCar++;
            }else if (command.equals("up")){
                rowCar--;
            }else if (command.equals("down")){
                rowCar++;
            }

            if (matrix[rowCar][colCar].equals(".")){
                km+=10;
            }
            if (matrix[rowCar][colCar].equals("T")){
                matrix[rowCar][colCar]=".";
                for (int r = 0; r < size ; r++) {
                    for (int c = 0; c < size; c++) {
                        if (matrix[r][c].equals("T")) {
                            matrix[r][c] = ".";
                            rowCar = r;
                            colCar = c;
                            km += 30;
                            break;
                        }
                    }
                }
            }

            if (matrix[rowCar][colCar].equals("F")){
                matrix[rowCar][colCar]="C";
                km+=10;
                inFinish=true;
                break;
            }

            matrix[rowCar][colCar]="C";
            command= scanner.nextLine();
        }
        if (inFinish){
            System.out.printf("Racing car %s finish%n",carNum);

        }else {
            System.out.printf("Racing car %s DFN%n",carNum);
        }
        System.out.printf("distance %d%n",km);
        printMatrix(matrix);


    }

    private static void fillMatrix(String[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            matrix[row]=scanner.nextLine().split("\\s+");
        }
    }

    private static void printMatrix(String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

}
