import java.util.Scanner;

public class RightTriangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Mauskan tinggi segitiga: ");
        int TinggiSegitiga = input.nextInt();

        for (int i = 0; i <= TinggiSegitiga; i++){
            for (int j = 0; j <= i; j++){
                System.out.print("*");
            }

            System.out.println();
    }
    }
}

