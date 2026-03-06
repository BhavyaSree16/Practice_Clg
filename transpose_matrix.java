import java.util.Scanner;
public class transpose_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = 3;
        int cols = 3;
        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix1[i][j]=sc.nextInt();
            }
        }
        //print
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(matrix1[i][j]+" ");
            }
            System.out.println("\n");
        }
        //Transpose
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix2[i][j]=matrix1[j][i];
            }
        }
        //printing the transpose
        System.out.println("After Transposing matrix will be : ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(matrix2[i][j]+" ");
            }
            System.out.println("\n");
        }
        sc.close();
    }
}
