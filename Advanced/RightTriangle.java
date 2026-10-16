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

// Segitiga Siku-siku dengan tinggi N 
// logikanya jika jumlah bintang pada baris ke -i sama dengan nomor baris tersebut
// yang berarti jumlah baris tersebut batasnya tergantung dengan nomor barisnya 
// contoh 1 -> 1 sampai 2 -> 1 sampai 3 dan seterus nya kalua pake bintang
// conoth * -> ** -> *** sampai n 

// langkahnya 
// tentukan nilai input dari jumlah segitiga siku siku 
// melakukan perulangan luar untuk mengulang dimana perulangan dari luar ke dalam conoth 1 - 1 > 1 - 2 > 1 - 3
// untuk perulangan dalam keluarkan * 
// untuk luar ketik saja tanpa mengeluarkan string 
// lalu jalankna 

