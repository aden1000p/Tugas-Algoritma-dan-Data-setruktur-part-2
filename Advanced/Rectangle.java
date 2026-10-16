import java.util.Scanner;

public class Rectangle{
    // membuat persegi tiga siku-siku
    public static void main(String[] args){
        // kita buat lebar dan panjangnya 
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan lebar: ");
        int lebar = input.nextInt();

        System.out.print("Masukan Panjang: ");
        int panjang = input.nextInt();

        // kita bisa menentukan suatu panjang dan lebarnya dengan loop 
        for (int i = 0; i < lebar; i++){
            for (int j = 0; j < panjang; j++){
                // ini untuk bintanya ke baris; 
                System.out.print("*");
            }
            System.out.println();
        }
    }
}