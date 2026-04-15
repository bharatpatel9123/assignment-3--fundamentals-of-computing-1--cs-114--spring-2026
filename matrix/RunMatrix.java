import java.util.Scanner;

public class RunMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the matrix: ");
        int size = scanner.nextInt();
        
        while (size <= 0) {
            System.out.print("Please enter a positive number: ");
            size = scanner.nextInt();
        }
        
        Matrix matrix = new Matrix(size);
        
        System.out.println("\nInitial matrix (all zeros):");
        matrix.printMatrix();
        
        matrix.populateMatrix();
        
        System.out.println("Populated matrix:");
        matrix.printMatrix();
        
        matrix.flipMatrix();
        
        System.out.println("Flipped matrix (along top-right to bottom-left diagonal):");
        matrix.printMatrix();
        
        scanner.close();
    }
}
