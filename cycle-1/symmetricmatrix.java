import java.util.Scanner;

public class symmetricmatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
System.out.println("Name:Febin fathima\nReg No:22MCA025\nCourse Code and Name: 20MCA132  OBJECT ORIENTED PROGRAMMING LAB\nDate:28/03/2023\n\n");
        System.out.print("Enter the number of rows of the matrix: ");
        int rows = input.nextInt();
        System.out.print("Enter the number of columns of the matrix: ");
        int cols = input.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter the elements of the matrix:");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        // check if matrix is symmetric
        boolean isSymmetric = true;
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                if(matrix[i][j] != matrix[j][i]) {
                    isSymmetric = false;
                    break;
                }
            }
        }

        if(isSymmetric) {
            System.out.println("The matrix is symmetric");
        } else {
            System.out.println("The matrix is not symmetric");
        }
    }
}
