public class Matrix {
    private int[][] matrix;
    private int size;

    public Matrix(int size) {
        this.size = size;
        this.matrix = new int[size][size];
        System.out.println("Created a " + size + "x" + size + " matrix");
    }

    private void swap(int x1, int y1, int x2, int y2) {
        int temp = matrix[x1][y1];
        matrix[x1][y1] = matrix[x2][y2];
        matrix[x2][y2] = temp;
    }

    public void printMatrix() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i + j == size - 1) {
                    System.out.print("\u001B[33m" + matrix[i][j] + "\u001B[0m\t");
                } else {
                    System.out.print(matrix[i][j] + "\t");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public void populateMatrix() {
        int counter = 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = counter++;
            }
        }
    }

    public void flipMatrix() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i + j < size - 1) {
                    int mirroredRow = size - 1 - j;
                    int mirroredCol = size - 1 - i;
                    swap(i, j, mirroredRow, mirroredCol);
                }
            }
        }
    }
}
