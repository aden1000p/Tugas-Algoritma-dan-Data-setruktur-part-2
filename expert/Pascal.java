import java.util.Scanner;

public class Pascal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukan angka sejumlah N : ");
        int N = input.nextInt();
        int[][] pascal = new int[N][N];

        for (int i = 0; i < N; i++){
            for (int j = 0; j <= i; j++){
                if (j == 0 || j == i){
                    pascal[i][j] = 1;
                }else{
                    pascal[i][j] = pascal[i-1][j-1] + pascal[i-1][j];
                }
                System.out.print(pascal[i][j] + " ");
            }
            System.out.println();
        }
        input.close();
    }
}