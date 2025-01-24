import java.util.Scanner;

public class identicalmatrix {
    public static int ismatricesIdentical(int[][] Grid1, int[][]Grid2, int N){
        for(int i=0;i<N;i++){
            for(int j=0; j<N; j++){
                if(Grid1[i][j]!=Grid2[i][j]){
                    return 0;
                }
            }
        }
        return 1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the matrix");
        int N = sc.nextInt();
        int[][] Grid1 = new int[N][N];
        int[][] Grid2 = new int[N][N];
        System.out.println("Enter the elements of the first matrix");
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                Grid1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the elements of the second matrix");
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                Grid2[i][j] = sc.nextInt();
            }
        }
        System.out.println(ismatricesIdentical(Grid1, Grid2, N));
        

    }
}
