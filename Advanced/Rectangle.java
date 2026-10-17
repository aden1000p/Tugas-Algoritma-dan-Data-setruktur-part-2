import java.util.Scanner;

public class Rectangle{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("masukan lebar: ");
        int lebar = input.nextInt();

        System.out.print("masukan panjang: ");
        int panjang = input.nextInt();

        for (int i = 0; i < panjang; i++){
            for (int j = 0; j < lebar; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}