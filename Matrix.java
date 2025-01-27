import java.util.*;

public class Matrix {

    public static int[][] matrixCreation() {

        int matrix[][] = new int[3][3];
        int n = matrix.length;
        int m = matrix[0].length;

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }

        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();

        }

        return matrix;

    }

    public static void searchMatrix(int matrix[][], int key) {

        int n = matrix.length;
        int m = matrix[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == key) {
                    System.out.print("Cell found at: (" + i + "," + j + ")");
                }
            }
            System.out.println();

        }

    }

    public static void largestEl(int matrix[][]) {

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                max = Math.max(max, matrix[i][j]);
            }

        }
        System.out.print("Largest of the matrix is: " + max);

    }

    public static void spiralMatrix() {

        int matrix[][] = {
                // {1,2,3,4},
                // {5,6,7,8},
                // {9,10,11,12}
                // ,{13,14,15,16}
                { 1, 2, 3 },
                { 5, 6, 7 },
                { 9, 10, 11 }
        };

        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {

            // for upper row..
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }

            // for Rigth Column
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");

            }

            // For Bottom Row..
            for (int j = endCol - 1; j >= startCol; j--) {
                if (startRow == endRow) {
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");

            }

            // For Left Column...
            for (int i = endRow - 1; i > startRow; i--) {
                if (startCol == endCol) {
                    break;
                }
                System.out.print(matrix[i][startCol] + " ");
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;

        }

    }

    public static void diagonalSum() {

        int matrix[][] = {
                { 1, 2, 3 },
                { 5, 6, 7 },
                { 9, 10, 11 }

        };

        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            sum = sum + matrix[i][i];

            if (matrix[i][matrix.length - i - 1] != matrix[i][i]) {
                sum += matrix[i][matrix.length - i - 1];
            }

        }
        System.out.print("Sum of digonals are: " + sum);

    }

    public static void sortedMatrixSearch() {

        int matrix[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 }, { 13, 14, 15, 16 }
        };

        int row = matrix.length - 1, col = 0;

        int key = 3;

        while (row >= 0 && col <= matrix[0].length - 1) {
            if (key == matrix[row][col]) {
                System.out.print("Element found at: (" + row + "," + col + ")");
                break;
            }

            else if (key > matrix[row][col]) {
                col++;
            }

            else if (key < matrix[row][col]) {
                row--;
            }

            else {
                System.out.print("The Element: " + key + " " + "Not Exist!!");
            }
        }

    }

    public static void sortedOneLoop() {
        int matrix[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 }, 
                { 13, 14, 15, 16 }
        };

        int key = 20;

        for (int i = 0; i < matrix.length; i++) {

            int start = 0;
            int end = matrix[i].length - 1;
            while (start <= end) {
                int mid = (start + end) / 2;

                if (key == matrix[i][mid]) {
                    System.out.println("Key found: " + i + "," + mid);
                    return;
                }

                else if (key > matrix[i][mid]) {
                    start = mid + 1;
                }
                else if(key< matrix[i][mid]){
                    end = mid - 1;
                } 
                
                
            }
            
        }
        System.out.print("Key not found");
    }

    

    public static void main(String args[]) {

        // int matrix[][] = matrixCreation();
        // largestEl(matrix);

        // searchMatrix(matrix, 5);

        // spiralMatrix();

        // diagonalSum();

        // sortedMatrixSearch();

        sortedOneLoop();

    }

}